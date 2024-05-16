package ClaseArchivoTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Crear un archivo de texto
        String fileName = "archivo.txt";
        crearArchivo(fileName);

        // Escribir en el archivo
        escribirEnArchivo(fileName, "Hola, este es un archivo de texto.");

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

    public static void escribirEnArchivo(String fileName, String contenido) {
        BufferedWriter writer;
        try  {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(contenido);
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

