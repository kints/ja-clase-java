package AlumnosAbstract;

// Clase abstracta Alumno
public abstract class Alumno {
  String nombre;
  int edad;
  boolean mayorEdad;
  String curp;
  String genero;
  String tipoSangre;

  public Alumno(String nombre, int edad, String curp, String genero, String tipoSangre) {
    this.nombre = nombre;
    this.edad = edad;
    this.curp = curp;
    this.genero = genero;
    this.tipoSangre = tipoSangre;
  }
  
  boolean getMayorEdad(){
    return mayorEdad;
  }
  // Métodos abstractos
  abstract void entrarEscuela();

  abstract void salirEscuela();

  abstract void listaMaterias();

  abstract void grado();
}
