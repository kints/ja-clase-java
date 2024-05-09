package AlumnosInterfaceEnvivo;

public class AppInterface {
  public static void main(String[] args) {
    AlumnoVespertino alumno1 = new AlumnoVespertino("Leslie Muñoz", 19, "ASDF234sASDF", "Femenino", "AB+");
    alumno1.entrarEscuela();
    alumno1.salirEscuela();
    alumno1.grado();
    alumno1.listaMaterias();

    System.out.println();
    System.out.println(alumno1.getNombre());
    alumno1.setNombre("Andrea Martínez");
    System.out.println("Cambie de nombre: " + alumno1.getNombre());

  }
}
