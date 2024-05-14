package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaz.AccionesAlumno;

public class Maestro implements AccionesAlumno {
  private String nombre;
  private int edad;
  private String curp;
  private String genero;
  private String tipoSangre;
  private boolean mayorEdad;
  public Maestro(String nombre, int edad, String curp, String genero, String tipoSangre) {
    this.nombre = nombre;
    this.edad = edad;
    this.curp = curp;
    this.genero = genero;
    this.tipoSangre = tipoSangre;
  }
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
