package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaz.AccionesAlumno;

public class Maestro implements AccionesAlumno {

  public Maestro(){
    
  }
  @Override
  public void entrarEscuela() {
    System.out.println("Maestro entra a la escuela");
  }

  @Override
  public void salirEscuela() {
   System.out.println("Maestro sale de la escuela");
  }

  @Override
  public void grado() {
    System.out.println("Grados que imparte el maestro en la escuela");
  }

  @Override
  public void listaMaterias() {
    System.out.println("Lista de materias que el maestro imparte a los alumnos");
  }

}
