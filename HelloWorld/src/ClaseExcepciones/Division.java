package ClaseExcepciones;

import java.util.Scanner;

public class Division {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el numerador:");
    int numerador = scanner.nextInt();
    System.out.println("Ingresa el denominador:");
    int denominador = scanner.nextInt();
    int resultado = dividir(numerador, denominador);
    System.out.println("El resultado de la división es: " + resultado);
  }

  public static int dividir(int numerador, int denominador) {

    return numerador / denominador;
  }
}
