package PaquetePersona;

public class Persona{
    String nombre;
    int edad;
    boolean esMayorEdad;
    String genero;
    
    public Persona(){
        nombre = "";
        edad = 0;
        esMayorEdad = false;
        genero = "";
    }

    public Persona(String nombreArg, int edadArg, String generoArg){
        nombre = nombreArg;
        edad = edadArg;
        genero = generoArg;
        esMayorEdad = edad >= 18 ? true : false;
    }

}