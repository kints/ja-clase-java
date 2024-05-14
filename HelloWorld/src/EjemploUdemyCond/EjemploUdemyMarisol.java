package EjemploUdemyCond;

import java.util.Scanner;

public class EjemploUdemyMarisol {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Hola, cuál es tu género?");
    String genero  = sc.nextLine();
    System.out.println("¿Cuál es tu edad?");
    int edad = sc.nextInt();
    sc.close();
    String resultado = "";

    if (genero.compareToIgnoreCase("Femenino") == 0) {
      resultado = "Eres mujer. \n\r"; 
    } else {
      if (genero.compareToIgnoreCase("Masculino") == 0) {
        resultado = "Eres hombre. \n\r";
      }
      else {
        resultado = "Eres un ser humano. \n\r";
      }
    }

    if (edad >= 18) {
      resultado += "Eres mayor de edad.";
    } else {
      resultado += "Eres menor de edad";
    }
    
    System.out.println(resultado);
  }
}
