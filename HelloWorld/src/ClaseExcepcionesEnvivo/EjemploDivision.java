package ClaseExcepcionesEnvivo;

import java.util.Scanner;

public class EjemploDivision {
  public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
    Scanner scanner = new Scanner(System.in);
    int resultado = 0;
    System.out.println("Por favor ingresa el numerador:");
    int numerador = scanner.nextInt();
    System.out.println("Introduce el denominador");
    int denominador = scanner.nextInt();
    try {
      resultado = hacerDivision(numerador, denominador);
    }
    catch (JAAritmeticExceptionDivision jaed) {
      System.out.println("Entre a la excepción JAA");
      jaed.printStackTrace();
    }
    catch (ArrayIndexOutOfBoundsException aiobe) {
      System.out.println("Se intentó acceder a una posición que esta fuera del arreglo");
      aiobe.printStackTrace();
    }
    catch(ArithmeticException ae){
      System.out.println("Error por intentar dividir entre 0");
      ae.printStackTrace();
    }
    catch (Exception e){
      System.out.println("Sucedio una excepción: " + e.getMessage());
      e.printStackTrace();
    } finally {
      scanner.close();
    }
    System.out.println("El resultado es: "+resultado);
  }
  static int hacerDivision(int numerador, int denominador) throws ArithmeticException, ArrayIndexOutOfBoundsException, JAAritmeticExceptionDivision {
    // int[] arreglo = {0,1,2,3,4};
    // System.out.println(arreglo[10]);
    if (denominador == 0) {
      throw new JAAritmeticExceptionDivision("El denominador es 0, no es posible ejecutar la división");
    }
    return numerador / denominador;
  }
}
