package AlumnosAbstract;

// Clase AlumnoSabatino
public class AlumnoSabatino extends Alumno {
  public AlumnoSabatino(String nombre, int edad, String curp, String genero, String tipoSangre) {
      super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  void entrarEscuela() {
      System.out.println("El alumno sabatino entra a la escuela");
  }

  @Override
  void salirEscuela() {
      System.out.println("El alumno sabatino sale de la escuela");
  }

  @Override
  void listaMaterias() {
      System.out.println("Lista de materias del alumno sabatino");
  }

  @Override
  void grado() {
      System.out.println("Grado del alumno sabatino");
  }
}