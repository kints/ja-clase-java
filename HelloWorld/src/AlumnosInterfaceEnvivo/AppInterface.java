package AlumnosInterfaceEnvivo;

public class AppInterface {
  public static void main(String[] args) {
    // AlumnoMatutino alumno1 = new AlumnoMatutino("Ingrid Salinas",22,
    // "INSA34562346",Alumno.GENERO_FEMENINO,"AB+");

    // System.out.println("La alumna(o) " +alumno1.getNombre() + " tiene: " + alumno1.getEdad() + " años.");
    // System.out.println("Genero "+ alumno1.getGenero());
System.out.println("-----------Alumno 2--------");
    AlumnoVespertino alumno2 = new AlumnoVespertino("Marcela Puente Fajardo", 15, 
    "MAPU345908DFG", Alumno.GENERO_FEMENINO, "O-");
  
    System.out.println("La alumna(o) " +alumno2.getNombre() + " tiene: " + alumno2.getEdad() + " años.");
    System.out.println("Genero "+ alumno2.getGenero());

    System.out.println("Edad de alumno "+ alumno2.getEdad() + "¿Es mayor de edad? "+ alumno2.isMayorEdad());
    System.out.println("Pasaron 11 años");
    alumno2.setEdad(26);
    System.out.println("Edad de alumno "+ alumno2.getEdad() + "¿Es mayor de edad? "+ alumno2.isMayorEdad());
  
    alumno2.muestraAlgo();
  }
}
