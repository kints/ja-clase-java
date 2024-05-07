package ClaseExcepciones;

import java.util.Scanner;

public class Division {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el numerador:");
    int numerador = scanner.nextInt();
    System.out.println("Ingresa el denominador:");
    int denominador = scanner.nextInt();

    try {
      int resultado = dividir(numerador, denominador);
      System.out.println("El resultado de la división es: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: No se puede dividir por cero.");
    }
  }

  public static int dividir(int numerador, int denominador) {
    if (denominador == 0) {
      throw new ArithmeticException("División por cero");
    }
    return numerador / denominador;
  }
}
