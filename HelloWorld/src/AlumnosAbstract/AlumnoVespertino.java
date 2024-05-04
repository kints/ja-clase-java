package AlumnosAbstract;

// Clase AlumnoVespertino
public class AlumnoVespertino extends Alumno {
  public AlumnoVespertino(String nombre, int edad, String curp, String genero, String tipoSangre) {
      super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  void entrarEscuela() {
      System.out.println("El alumno vespertino entra a la escuela");
  }

  @Override
  void salirEscuela() {
      System.out.println("El alumno vespertino sale de la escuela");
  }

  @Override
  void listaMaterias() {
      System.out.println("Lista de materias del alumno vespertino");
  }

  @Override
  void grado() {
      System.out.println("Grado del alumno vespertino");
  }
}
