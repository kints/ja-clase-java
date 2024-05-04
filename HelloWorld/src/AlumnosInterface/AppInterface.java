package AlumnosInterface;

public class AppInterface {
  public static void main(String[] args) {
    AlumnoSabatino alumno = new AlumnoSabatino("Arturo Quintos",
    37, "QUNA861024HDFNGR01", "Masculino", "A+");
    alumno.entrarEscuela();
    alumno.salirEscuela();
    alumno.listaMaterias();
    alumno.grado();
  }
}
