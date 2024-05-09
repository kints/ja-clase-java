package AlumnosAbstract;

public class AlumnoNocturno extends Alumno {

  public AlumnoNocturno(String nombre, int edad, String curp, String genero, String tipoSangre) {
    super(nombre, edad, curp, genero, tipoSangre);
    
  }
  @Override
  void entrarEscuela(){
    System.out.println("El alumno nocturno entro a la escuela");
  }
  @Override
  void salirEscuela(){
    System.out.println("El alumno nocturno sale de la escuela");
  }
  @Override
  void grado(){
    System.out.println("Grado del alumno nocturno");
  }
  @Override
  void listaMaterias(){
    System.out.println("Lista de materias del alumno nocturno");
  }
}
