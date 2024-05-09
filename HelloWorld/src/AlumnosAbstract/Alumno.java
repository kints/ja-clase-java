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
    setupMayorEdad(this.edad);
  }
  
  private void setupMayorEdad(int edad){
    if (this.edad >= 18) {
      this.mayorEdad =  true;
    }
    else {
      this.mayorEdad = false;
    }
  }

  public void setEdad(int edad){
    this.edad = edad;
    setupMayorEdad(this.edad);
  }

  public void setEdad(float edad){
    setEdad( (int) edad ); //Cast float a int
  }

  public int getEdad(){
    return this.edad;
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
