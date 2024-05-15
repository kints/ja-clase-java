package AlumnosInterfaceEnvivo;

public class AppInterface {
  public static void main(String[] args) {

    System.out.println("Es mayor de edad?: " + Alumno.validarMayorEdad(18));

    AlumnoMatutino alumno1 = new AlumnoMatutino("Neira Plascencia", 15,"NEPLA4352345",
    Alumno.GENERO_FEMENINO, "O-");
    // alumno1.entrarEscuela();
    // alumno1.salirEscuela();
    // alumno1.grado();
    // alumno1.listaMaterias();
    System.out.println();
    System.out.println(alumno1.getNombre());
    System.out.println("Edad: "+ alumno1.getEdad());
    System.out.println("¿Es mayor de edad?: "+ alumno1.isMayorEdad());
    System.out.println("Pasaron 5 años");
    alumno1.setEdad(20);
    System.out.println("¿Es mayor de edad?: "+ alumno1.isMayorEdad());
    System.out.println();
    System.out.println(alumno1.cuidadosTipoSangre());

// System.out.println("------------Segundo Alumno----------");

//     AlumnoVespertino alumno2 =  new AlumnoVespertino("Carla con C", 21, "CACC345234ASDF",
//     Alumno.GENERO_FEMENINO, "O+");

//     alumno2.entrarEscuela();
//     alumno2.salirEscuela();
//     alumno2.grado();
//     alumno2.listaMaterias();
//     System.out.println();
//     System.out.println(alumno2.getNombre());
//     System.out.println(alumno2.getGenero());

  }
}
