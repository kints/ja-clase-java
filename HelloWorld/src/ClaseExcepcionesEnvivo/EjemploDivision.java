package ClaseExcepcionesEnvivo;

import java.util.Scanner;

public class EjemploDivision {
  public static void main(String[] args) throws JAArtitmeticExceptionDivision {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa por favor el numerador");
    int numerador = sc.nextInt();
    System.out.println("Ingresa por favor el denominador");
    int denominador = sc.nextInt();
    int resultado = 0;
    try {
      resultado = hacerDivision(numerador, denominador);
    } catch (JAArtitmeticExceptionDivision e) {
      System.out.println("Entre a catch");
      System.out.println(e.getMessage());
      e.printStackTrace();
      
    }
    finally{
      System.out.println("Entre a finally");
      sc.close();
    }
    System.out.println("El resultado es: " + resultado);
  }
  public static int hacerDivision(int numerador, int denominador) throws JAArtitmeticExceptionDivision {
    if (denominador == 0){
      throw new JAArtitmeticExceptionDivision("El denominador es 0, no se puede dividir por 0");
    }
    return numerador / denominador;
  }
}
