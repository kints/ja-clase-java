package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaces.AccionesAlumno;

public class AlumnoMatutino extends Alumno implements AccionesAlumno {

  public AlumnoMatutino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
  }

  public void entrarEscuela(){
    System.out.println("Alumno entra a la escuela en la mañana");
    System.out.println("El alumno recibe su desayuno escolar");
  }

  public void salirEscuela(){
    System.out.println("Alumno guarda sus cosas");
    System.out.println("Espera en la puerta a que llegue su familiar");
    System.out.println("Alumno sale de al escuela con su familiar");
  }

  public void grado(){
    System.out.println("El grado escolar del Alumno");
  }

  public void listaMaterias(){
    System.out.println("La lista de materias de la mañana");
  }
}
