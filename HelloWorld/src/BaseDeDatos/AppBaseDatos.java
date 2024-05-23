package BaseDeDatos;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import BaseDeDatos.model.Alumno;

public class AppBaseDatos {
  Connection connection = null;
  PreparedStatement preparedStatement = null;

  public void connectDatabase() {
    try {
      try {
        Class.forName("org.postgresql.Driver");
      } catch (ClassNotFoundException ex) {
        System.out.println("Error al registrar el driver PostgreSQL: " + ex);
      }

      connection = DriverManager.getConnection(
          "jdbc:postgresql://ep-rough-base-a5t31fog.us-east-2.aws.neon.tech/JA-claseJAVA?user=JA-Mexico_owner&password=Zq0WsVkzB3po&sslmode=require");
      boolean valid = connection.isValid(50000);
      System.out.println(valid ? "TEST OK" : "TEST FAIL");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public void insertarAlumnos() {
    try {

      String sql = "INSERT INTO alumno (id, matricula, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, tipo_sangre, curp, genero, fecha_alta, activo, fecha_baja) "
          +
          "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      preparedStatement = connection.prepareStatement(sql);
      List<Alumno> alumnos = Arrays.asList(
          new Alumno("A2013001", "Juan", "Pérez", "López", Date.valueOf(LocalDate.of(2013, 5, 10)), "O+",
              "PEJX131010HDFLRN09", "Masculino"),
          new Alumno("A2013002", "María", "García", "Hernández", Date.valueOf(LocalDate.of(2013, 8, 15)), "A-",
              "GAHM131015MDFLRN01", "Femenino"),
          new Alumno("A2013003", "Carlos", "Martínez", "Rodríguez", Date.valueOf(LocalDate.of(2013, 12, 22)), "B+",
              "MARC131222HDFLRN02", "Masculino"),
          new Alumno("A2013004", "Lucía", "Sánchez", "Fernández", Date.valueOf(LocalDate.of(2013, 2, 3)), "AB+",
              "SALF130203MDFLRN03", "Femenino"),
          new Alumno("A2013005", "Pedro", "Ramírez", "Gómez", Date.valueOf(LocalDate.of(2013, 7, 18)), "O-",
              "RAGP130718HDFLRN04", "Masculino"));

      // Insertar cada alumno
      for (Alumno alumno : alumnos) {
        preparedStatement.setObject(1, alumno.getId());
        preparedStatement.setString(2, alumno.getMatricula());
        preparedStatement.setString(3, alumno.getNombre());
        preparedStatement.setString(4, alumno.getApellidoPaterno());
        preparedStatement.setString(5, alumno.getApellidoMaterno());
        preparedStatement.setDate(6, alumno.getFechaNacimiento());
        preparedStatement.setString(7, alumno.getTipoSangre());
        preparedStatement.setString(8, alumno.getCurp());
        preparedStatement.setString(9, alumno.getGenero());
        preparedStatement.setTimestamp(10, Timestamp.valueOf(LocalDateTime.now()));
        preparedStatement.setBoolean(11, alumno.isActivo());
        preparedStatement.setTimestamp(12, null);

        preparedStatement.executeUpdate();
      }

      System.out.println("Inserción completada.");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      // Cerrar recursos
      try {
        if (preparedStatement != null)
          preparedStatement.close();
        if (connection != null)
          connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    preparedStatement = null;
  }

  public void darDeBajaAlumno(String id){
    try {
      // SQL para actualizar un registro de la tabla alumno
      String sql = "UPDATE alumno SET activo = ?, fecha_baja = ? WHERE id = ?";

      preparedStatement = connection.prepareStatement(sql);

      // Datos del alumno a actualizar
      UUID idAlumno = UUID.fromString(id);
      Date fechaBaja = new Date(new java.util.Date().getTime());
      boolean nuevoActivo = false;


      // Establecer los parámetros en el PreparedStatement
      preparedStatement.setBoolean(1, nuevoActivo);
      preparedStatement.setDate(2, fechaBaja);
      preparedStatement.setObject(3, idAlumno);

      int rowsAffected = preparedStatement.executeUpdate();
      System.out.println("Número de registros actualizados: " + rowsAffected);

  } catch (SQLException e) {
      e.printStackTrace();
  } finally {
      // Cerrar recursos
      try {
          if (preparedStatement != null) preparedStatement.close();
          if (connection != null) connection.close();
      } catch (SQLException e) {
          e.printStackTrace();
      }
  }
}
 

  public void borrarAlumnos(String matricula){
    try {
      // SQL para borrar registros de la tabla alumno basándose en la matricula
      String sql = "DELETE FROM alumno WHERE matricula = ?";

      // Ejemplo de matrícula de un alumno a borrar (deberías reemplazarlo con un valor real)
      String matriculaAlumno = matricula;

      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, matriculaAlumno);

      int rowsAffected = preparedStatement.executeUpdate();
      System.out.println("Número de registros borrados: " + rowsAffected);

  } catch (SQLException e) {
      e.printStackTrace();
  } finally {
      // Cerrar recursos
      try {
          if (preparedStatement != null) preparedStatement.close();
          if (connection != null) connection.close();
      } catch (SQLException e) {
          e.printStackTrace();
      }
  }
}

  public void regresarAlumnos(){
    ResultSet resultSet = null;
        List<Alumno> alumnos = new ArrayList<>();

        try {
            // SQL para seleccionar todos los registros de la tabla alumno
            String sql = "SELECT id, matricula, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, tipo_sangre, curp, genero, activo FROM alumno";

            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            // Iterar sobre los resultados de la consulta
            while (resultSet.next()) {
                Alumno alumno = new Alumno(
                    resultSet.getString("matricula"),
                    resultSet.getString("nombre"),
                    resultSet.getString("apellido_paterno"),
                    resultSet.getString("apellido_materno"),
                    resultSet.getDate("fecha_nacimiento"),
                    resultSet.getString("tipo_sangre"),
                    resultSet.getString("curp"),
                    resultSet.getString("genero")
                );

                // Asignar manualmente el UUID y el campo activo
                alumno.setId((UUID) resultSet.getObject("id"));
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }
            //alumnos.forEach(alumno -> System.out.println(alumno));
            alumnos.forEach(System.out::println);
            // Mostrar los alumnos en la consola
            /*for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }*/

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

  public static void main(String[] args) {
    AppBaseDatos app = new AppBaseDatos();
    try {
      app.connectDatabase();
      app.darDeBajaAlumno("081c4178-d4c5-45dc-986f-2acc76134453");
      //app.insertarAlumnos();
      //app.regresarAlumnos();
      //app.borrarAlumnos("A2013001");

    } catch (Exception e) {
    
      e.printStackTrace();
    }

  }
}
