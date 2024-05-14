package AlumnosInterfaceEnvivo;

public class AppInterface {
  public static void main(String[] args) {
    
    //System.out.println("Es mayor de edad si tengo 18 años? " + Alumno.esMayorEdad(18));
    
    //int valor = AlumnoMatutino.muestraMensaje();
    //System.out.println(valor);

    AlumnoVespertino alumno1   = new AlumnoVespertino("Tania Itzel", 13, "TAIT234523ASDF",
    Alumno.GENERO_FEMENINO, "AB+");
   // alumno1.muestraAlgo();
   System.out.println(alumno1.getGenero());
    
    AlumnoVespertino alumno2   = new AlumnoVespertino("María Díaz", 28, "MADI234523ASDF",
    Alumno.GENERO_FEMENINO, "AB+");
    System.out.println(alumno2.getGenero());

    // AlumnoMatutino alumno3 = new AlumnoMatutino("Arturo Quinto",
    //  37, "QUNA861024HDFNGR01", Alumno.GENERO_MASCULINO, "A+");
    // System.out.println(alumno3.getGenero());

    // alumno1.entrarEscuela();
    // alumno1.salirEscuela();
    // alumno1.grado();
    // alumno1.listaMaterias();
    // System.out.println();
    // System.out.println("el nombre del alumno es: "+alumno1.getNombre());
    // alumno1.setNombre("Citlalli Ramírez");
    // System.out.println("Cambie el nombre del alumno ahora es: "+alumno1.getNombre());
  }
}
