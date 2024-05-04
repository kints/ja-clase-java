package AlumnosInterface;
// Clase AlumnoSabatino
public class AlumnoSabatino extends Alumno implements AccionesAlumno {
  public AlumnoSabatino(String nombre, int edad, String curp, String genero, String tipoSangre) {
      super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  public void entrarEscuela() {
      System.out.println("El alumno sabatino entra a la escuela");
  }

  @Override
  public void salirEscuela() {
      System.out.println("El alumno sabatino sale de la escuela");
  }

  @Override
  public void listaMaterias() {
      System.out.println("Lista de materias del alumno sabatino");
  }

  @Override
  public void grado() {
      System.out.println("Grado del alumno sabatino");
  }
}
