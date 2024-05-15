package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaz.AccionesAlumno;

public class AlumnoMatutino extends Alumno implements AccionesAlumno {

  public AlumnoMatutino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
    // Codigo especifico para Alumno Matutino
  }
  @Override
  public void entrarEscuela() {
    System.out.println("Alumno entra a la escuela");
    System.out.println("Alumno recibe su desayuno escolar");
  }



  public void salirEscuela() {
    System.out.println("Alumno se acerca a la salida y espera a su familiar");
    System.out.println("El familiar llega y se lleva al alumno");
  }

  public void grado() {
    System.out.println("Grado del alumno matutino");
  }

  public void listaMaterias() {
    System.out.println("Lista de materias del alumno matutino");
  }
}
