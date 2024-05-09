package AlumnosInterfaceEnvivo;

public class Alumno {
  private String nombre;
  private int edad;
  private String curp;
  private String genero;
  private String tipoSangre;

  public Alumno(String nombre, int edad, String curp, String genero, String tipoSangre) {
      this.nombre = nombre;
      this.edad = edad;
      this.curp = curp;
      this.genero = genero;
      this.tipoSangre = tipoSangre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getTipoSangre() {
    return tipoSangre;
  }

  public void setTipoSangre(String tipoSangre) {
    this.tipoSangre = tipoSangre;
  }
}
