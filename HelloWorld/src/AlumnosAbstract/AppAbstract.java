package AlumnosAbstract;

public class AppAbstract {
  public static void main(String[] args) {
    Alumno alumno = new AlumnoSabatino("Arturo Quintos",
    15, "QUNA861024HDFNGR01", "Masculino", "A+");
    alumno.entrarEscuela();
    alumno.salirEscuela();
    alumno.listaMaterias();
    alumno.grado();


  }
}
