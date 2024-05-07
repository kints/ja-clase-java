package AlumnosAbstract;

public class AppAbstract {
  public static void main(String[] args) {
    Alumno alumno = new AlumnoSabatino("Arturo Quintos",
    15, "QUNA861024HDFNGR01", "Masculino", "A+");
    alumno.entrarEscuela();
    alumno.salirEscuela();
    alumno.listaMaterias();
    alumno.grado();
    System.out.println();
    System.out.println(alumno.getMayorEdad());
    System.out.println("Pasaron 4 años");
    // alumno.setEdad(19);
    alumno.setEdad(19.5f);
    System.out.println("Cambie la variable");
    System.out.println("Valor de edad: " + alumno.getEdad());
    System.out.println(alumno.getMayorEdad());

  }
}
