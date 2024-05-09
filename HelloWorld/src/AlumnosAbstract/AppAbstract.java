package AlumnosAbstract;

public class AppAbstract {
  public static void main(String[] args) {
    Alumno alumno1 = new AlumnoMatutino("Arturo Quintos",
    15, "QUNA861024HDFNGR01", "Masculino", "A+");
    System.out.println("-----------Alumno 1-------------");
    alumno1.entrarEscuela();
    alumno1.salirEscuela();
    alumno1.listaMaterias();
    alumno1.grado();

    System.out.println();

    System.out.println("El alumno es mayor de edad? " + alumno1.getMayorEdad());
    //Brinque 4 años
    alumno1.setEdad(19.9874654654365f);
    System.out.println("Cambie el atributo");
    System.out.println("El alumno es mayor de edad? " + alumno1.getMayorEdad() + " Edad del alumno: " + alumno1.getEdad());

    Alumno alumno2 = new AlumnoNocturno("Esmeralda Orozco", 22, "OOFE9807234D0", "Femenino", "O+");
    System.out.println("----------------Alumno 2-------------------");
    alumno2.entrarEscuela();
    alumno2.salirEscuela();
    alumno2.listaMaterias();
    alumno2.grado();
    System.out.println("El alumno es mayor de edad? " + alumno2.getMayorEdad() + " Edad del alumno: " + alumno2.getEdad());
  }
}
