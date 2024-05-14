package ClaseExcepciones;

import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Division {
  public static void main(String[] args) throws JAAritmeticException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el numerador:");
    int numerador = scanner.nextInt();
    System.out.println("Ingresa el denominador:");
    int denominador = scanner.nextInt();
    
    try {
      int resultado = dividir(numerador, denominador);
      System.out.println("El resultado de la división es: " + resultado);
    } catch ( JAAritmeticException ex ) {
      System.out.println("Hubo una falla en el tiempo de ejecución");
      System.out.println(ex.getMessage());
      ex.printStackTrace();
    } catch (ArithmeticException ae){
      ae.printStackTrace();
    }
    finally {
      System.out.println("Cerrar el scanner");
      scanner.close();
    }
    
    
  }

  public static int dividir(int numerador, int denominador) throws JAAritmeticException {
    if (numerador == 0 && denominador == 0) {
      throw new JAAritmeticException("Estas intentando hacer una division de 0 entre 0");
    }
    if (denominador == 0){
      throw new JAAritmeticException("Estas intentando hacer una division entre 0");
    }
    return numerador / denominador;
  }
}
