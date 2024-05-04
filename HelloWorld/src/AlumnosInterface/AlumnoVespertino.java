package AlumnosInterface;

// Clase AlumnoVespertino
public class AlumnoVespertino extends Alumno implements AccionesAlumno {
  public AlumnoVespertino(String nombre, int edad, String curp, String genero, String tipoSangre) {
      super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  public void entrarEscuela() {
      System.out.println("El alumno vespertino entra a la escuela");
  }

  @Override
  public void salirEscuela() {
      System.out.println("El alumno vespertino sale de la escuela");
  }

  @Override
  public void listaMaterias() {
      System.out.println("Lista de materias del alumno vespertino");
  }

  @Override
  public void grado() {
      System.out.println("Grado del alumno vespertino");
  }
}

