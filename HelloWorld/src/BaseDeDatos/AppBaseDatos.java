package BaseDeDatos;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
          "jdbc:postgresql://ep-rough-base-a5t31fog.us-east-2.aws.neon.tech/JA-Mexico?user=JA-Mexico_owner&password=Zq0WsVkzB3po&sslmode=require");
      boolean valid = connection.isValid(50000);
      System.out.println(valid ? "TEST OK" : "TEST FAIL");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public void insertarEjemplo() {
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
  }

  public static void main(String[] args) {
    AppBaseDatos app = new AppBaseDatos();
    try {
      app.connectDatabase();

      // SQL para insertar en la tabla alumno

    } catch (Exception e) {
      // TODO: handle exception
    }

  }
}
