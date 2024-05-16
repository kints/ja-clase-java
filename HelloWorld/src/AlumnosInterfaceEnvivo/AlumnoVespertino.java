package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaz.AccionesAlumno;

public class AlumnoVespertino extends Alumno implements AccionesAlumno {

  public AlumnoVespertino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void muestraAlgo()

  @Override
  public void entrarEscuela() {
    System.out.println("Alumno de la tarde entra a la escuela");
    System.out.println("Ya comio entonces directo a estudiar");
  }

  @Override
  public void salirEscuela() {
    System.out.println("Alumno despues de jugar se acerca a la salida");
    System.out.println("llega su familiar y se va el alumno");
  }

  @Override
  public void grado() {
    System.out.println("Grado escolar del alumno de la tarde");
  }

  @Override
  public void listaMaterias() {
    System.out.println("Lista de materias del alumno vespertino");
  }

}
