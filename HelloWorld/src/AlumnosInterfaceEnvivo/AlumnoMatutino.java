package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaz.AccionesAlumno;

public class AlumnoMatutino extends Alumno implements AccionesAlumno {
  public AlumnoMatutino(String nombre, int edad, String curp,
  String genero, String tipoSangre){
    super(nombre, edad, curp, genero, tipoSangre);
  }
  @Override
  public void entrarEscuela(){
    System.out.println("Alumno entra a la escuela");
    System.out.println("Alumno come su desayuno escolar");
  }
  @Override
  public void salirEscuela(){
    System.out.println("Alumno se acerca a la salida esperando su familiar");
    System.out.println("Alumno se va con su familiar");
  }
  @Override
  public void grado(){
    System.out.println("Grado escolar del alumno de la mañana");
  }
  @Override
  public void listaMaterias(){
    System.out.println("Lista de materias matutinas");
  }
}
