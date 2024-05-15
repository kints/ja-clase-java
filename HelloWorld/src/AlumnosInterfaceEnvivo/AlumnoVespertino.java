package AlumnosInterfaceEnvivo;

import AlumnosInterface.AccionesAlumno;

public class AlumnoVespertino extends Alumno implements AccionesAlumno {

  public AlumnoVespertino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void entrarEscuela() {
    System.out.println("Alumno ya comido entra a la escuela");
    System.out.println("Alumno entra directo a clases");
  }

  @Override
  public void salirEscuela() {
    System.out.println("Alumno se acerca a la salida esperando su familiar");
    System.out.println("Llega el familiar y se lleva al alumno a cenar");
  }

  @Override
  public void listaMaterias() {
    System.out.println("Lista de materias de la tarde");
  }

  @Override
  public void grado() {
    System.out.println("Grado escolar del alumno de la tarde");
  }

}
