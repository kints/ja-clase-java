public class AlumnoVariosTipos {
  public class Alumno {
    String nombre;
    String curp;
    String turno;

    void entrarEscuela() {
      if (turno.compareToIgnoreCase("matutino") == 0) {
        System.out.println("El alumno matutino entra a la escuela");
      } else if (turno.compareToIgnoreCase("vespertino") == 0) {
        System.out.println("El alumno vespertino entra a la escuela");
      } else if (turno.compareToIgnoreCase("sabatino") == 0) {
        System.out.println("El alumno sabatino entra a la escuela");
      }

    }

    void salirEscuela() {
      if (turno.compareToIgnoreCase("matutino") == 0) {
        System.out.println("El alumno matutino sale de la escuela");
      } else if (turno.compareToIgnoreCase("vespertino") == 0) {
        System.out.println("El alumno vespertino sale de la escuela");
      } else if (turno.compareToIgnoreCase("sabatino") == 0) {
        System.out.println("El alumno sabatino sale de la escuela");
      }
    }

    void listaMaterias() {
      if (turno.compareToIgnoreCase("matutino") == 0) {
        System.out.println("Lista de materias del alumno matutino");
      } else if (turno.compareToIgnoreCase("vespertino") == 0) {
        System.out.println("Lista de materias del alumno vespertino");
      } else if (turno.compareToIgnoreCase("sabatino") == 0) {
        System.out.println("Lista de materias del alumno sabatino");
      }
    }

    void grado() {
      if (turno.compareToIgnoreCase("matutino") == 0) {
        System.out.println("Grado del alumno matutino");
      } else if (turno.compareToIgnoreCase("vespertino") == 0) {
        System.out.println("Grado del alumno vespertino");
      } else if (turno.compareToIgnoreCase("sabatino") == 0) {
        System.out.println("Grado del alumno sabatino");
      }
      
    }
  }
}
