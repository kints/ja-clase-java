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
    System.out.println("Grado escolar que imparte el maestro");
  }
  
  @Override
  public void listaMaterias() {
    System.out.println("Lista de materias que el maestro da clase");
  }

}
