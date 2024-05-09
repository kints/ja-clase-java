package AlumnosInterfaceEnvivo;

public class Alumno {
  String nombre;
  int edad;
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
}
