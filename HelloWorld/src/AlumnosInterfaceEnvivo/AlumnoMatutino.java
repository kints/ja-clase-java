package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaz.AccionesAlumno;

public class AlumnoMatutino extends Alumno implements AccionesAlumno {

  public AlumnoMatutino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
  }

  public static int muestraMensaje(){
    System.out.println("Este es el método estático");
    return 1;
  }

  @Override
  public void muestraAlgo()

  @Override
  public void entrarEscuela(){
    System.out.println("Alumno llega sin desayunar a la escuela");
    System.out.println("Alumno recibe su desayuno escolar");
  }
  @Override
  public void salirEscuela(){
    System.out.println("Alumno se acerca a la salida y espera a su familiar");
    System.out.println("El familiar llega y se lleva al alumno");
  }
  @Override
  public void grado(){
    System.out.println("Grado escolar del alumno de la mañana");
  }
  @Override
  public void listaMaterias(){
    System.out.println("Lista de materias que cursa el alumno matutino");
  }
}
