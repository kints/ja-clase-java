package AlumnosAbstract;

// Clase AlumnoMatutino
public class AlumnoMatutino extends Alumno {
    private String menuDesayuno = "huevito con frijoles";
  public AlumnoMatutino(String nombre, int edad, String curp, String genero, String tipoSangre) {
      super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  void entrarEscuela() {
      System.out.println("El alumno matutino entra a la escuela");
  }

  @Override
  void salirEscuela() {
      System.out.println("El alumno matutino sale de la escuela");
  }

  @Override
  void listaMaterias() {
      System.out.println("Lista de materias del alumno matutino");
  }

  @Override
  void grado() {
      System.out.println("Grado del alumno matutino");
  }
}
