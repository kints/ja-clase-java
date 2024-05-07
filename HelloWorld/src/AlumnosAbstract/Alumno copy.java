package AlumnosAbstract;

// Clase abstracta Alumno
public abstract class Alumno {
  private String nombre;
  private int edad;
  private boolean mayorEdad;
  private String curp;
  private String genero;
  private String tipoSangre;

  public Alumno(String nombre, int edad, String curp, String genero, String tipoSangre) {
    this.nombre = nombre;
    this.edad = edad;
    this.curp = curp;
    this.genero = genero;
    this.tipoSangre = tipoSangre;
    setupMayorEdad();
  }

  public int getEdad() {
    return edad;
  }

  private void setupMayorEdad() {
    if (edad >= 18) {
      mayorEdad = true;
    } else {
      mayorEdad = false;
    }
  }

  public void setEdad(int edad) {
    this.edad = edad;
    setupMayorEdad();
  }

  public void setEdad(float edad){
    this.edad = (int) edad; //cast transformar de un tipo de dato a otro
    setupMayorEdad();
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
