package AlumnosInterfaceEnvivo;

import AlumnosInterface.AccionesAlumno;

public class AlumnoSabatino extends Alumno implements AccionesAlumno {

  public AlumnoSabatino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void entrarEscuela() {
    System.out.println("Entra alumno a la escuela abierta sabatina");
  }

  @Override
  public void salirEscuela() {
    System.out.println("Alumno sale de la escuela en la tarde para luego irse de fiesta");
  }

  @Override
  public void listaMaterias() {
    System.out.println("Lista de materias de la escuela abierta sabatina");
  }

  @Override
  public void grado() {
    System.out.println("Sistema abierto y lleva otra categoria de grado");
  }

  

}
