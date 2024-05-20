package ClaseExcepcionesEnvivo;

public class JAAritmeticExceptionDivision extends Exception {
  public JAAritmeticExceptionDivision(String msg){
    super("JA Error: " + msg);
  }
}
