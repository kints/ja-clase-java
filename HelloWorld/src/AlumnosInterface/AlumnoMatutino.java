package AlumnosInterface;

// Clase AlumnoMatutino
public class AlumnoMatutino extends Alumno implements AccionesAlumno {
  public AlumnoMatutino(String nombre, int edad, String curp, String genero, String tipoSangre) {
      super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  public void entrarEscuela() {
      System.out.println("El alumno matutino entra a la escuela");
  }

  @Override
  public void salirEscuela() {
      System.out.println("El alumno matutino sale de la escuela");
  }

  @Override
  public void listaMaterias() {
      System.out.println("Lista de materias del alumno matutino");
  }

  @Override
  public void grado() {
      System.out.println("Grado del alumno matutino");
  }
}


