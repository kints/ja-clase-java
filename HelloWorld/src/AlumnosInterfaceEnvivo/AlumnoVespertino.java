package AlumnosInterfaceEnvivo;

import AlumnosInterfaceEnvivo.interfaces.AccionesAlumno;

public class AlumnoVespertino extends Alumno implements AccionesAlumno {
  public AlumnoVespertino(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
  }

  @Override
  public void entrarEscuela() {
    System.out.println("El alumno vespertino ya entra comido");
    System.out.println("Alumno vespertino entra a la escuela");
    
  }

  @Override
  public void salirEscuela() {
    System.out.println("El alumno verpertino espera a su familiar");
    System.out.println("Alumno vespertino sale de la escuela para cenar en su casa");
  }

  @Override
  public void grado() {
    System.out.println("Grado escolar de la tarde");
  }

  @Override
  public void listaMaterias() {
    System.out.println("Lista de materias de la tarde");
  }
}
