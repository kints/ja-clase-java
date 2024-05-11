package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaz.AccionesAlumno;

public class AlumnoVespertino extends Alumno implements AccionesAlumno {

  public AlumnoVespertino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  public void entrarEscuela() {
    System.out.println("El alumno ya comido llega a la escuela");
    System.out.println("El alumno llega directamente a clases");
  }

  @Override
  public void salirEscuela() {
    System.out.println("El alumno se acerca a la salida despues de haber jugado");
    System.out.println("El alumno se va con su familiar a su casa");
  }

  @Override
  public void grado() {
    System.out.println("Grado del alumno vespertino");
  }

  @Override
  public void listaMaterias() {
    System.out.println("Lista de materias de alumno vespertino");
  }

  

}
