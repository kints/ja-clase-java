package ClaseArchivoTexto;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import ClaseArchivoTexto.domain.Alumno;

public class FileReadWriteExample {
    
    
    public static void main(String[] args) {
        Alumno[] alumnos = {
            new Alumno("Marcela Puente Fajardo", 15,"MAPU345908DFG", Alumno.GENERO_FEMENINO, "O-"),
            new Alumno("Ingrid Salinas",22, "INSA34562346",Alumno.GENERO_FEMENINO,"AB+"),
            new Alumno("Arturo Quintos",15, "QUNA861024HDFNGR01", "Masculino", "A+"),
            new Alumno("Esmeralda Orozco", 22, "OOFE9807234D0", "Femenino", "O+")
        };
        // Crear un archivo de texto
        String fileName = "archivo.txt";
        crearArchivo(fileName);

        // Escribir en el archivo
        escribirEnArchivo(fileName, alumnos);

        // Leer el archivo
        List<String> lineas = leerArchivo(fileName);
        System.out.println("Contenido del archivo:");
        lineas.forEach(System.out::println);
    }

    public static void crearArchivo(String fileName) {
        try {
            Files.createFile(Paths.get(fileName));
            System.out.println("Archivo creado: " + fileName);
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public static void escribirEnArchivo(String fileName, Alumno[] alumnos) {
        PrintWriter writer = null;
        try  {
            writer = new PrintWriter(new FileWriter(fileName));
            for (Alumno alumno : alumnos) {
                writer.write(alumno.toString());    
            }
            System.out.println("Contenido escrito en el archivo.");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static List<String> leerArchivo(String fileName) {
        List<String> lineas = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            lineas = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }
}

