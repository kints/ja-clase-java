package ClaseArchivoTextoCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReadWriteExample {
    public static void main(String[] args) {
        String fileName = "datos.csv";

        // Crear registros CSV
        List<String[]> registros = new ArrayList<>();
        registros.add(new String[]{"Juan", "25", "Pizza"});
        registros.add(new String[]{"María", "30", "Sushi"});
        registros.add(new String[]{"Pedro", "22", "Hamburguesa"});
        registros.add(new String[]{"Ana", "28", "Ensalada"});
        registros.add(new String[]{"Luis", "35", "Tacos"});

        // Escribir registros CSV en el archivo
        escribirRegistrosCSV(fileName, registros);

        // Leer registros CSV del archivo
        List<String[]> registrosLeidos = leerRegistrosCSV(fileName);
        System.out.println("Registros leídos del archivo:");
        for (String[] registro : registrosLeidos) {
            for (String campo : registro) {
                System.out.print(campo + ", ");
            }
            System.out.println();
        }
    }

    public static void escribirRegistrosCSV(String fileName, List<String[]> registros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String[] registro : registros) {
                writer.write(String.join(",", registro));
                writer.newLine();
            }
            System.out.println("Registros escritos en el archivo CSV.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }

    public static List<String[]> leerRegistrosCSV(String fileName) throws IOException {
        List<String[]> registros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                registros.add(campos);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
        return registros;
    }
}
