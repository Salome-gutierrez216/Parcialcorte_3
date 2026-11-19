/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author salom
 */

public class GestorPersistencia {
    public static final String ARCHIVO_HISTORIAL = "historial_combate.txt";

    public void guardarRegistro(String registro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_HISTORIAL, true))) {
            writer.write(registro);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir el historial: " + e.getMessage());
        }
    }

    public String leerHistorial() {
        File archivo = new File(ARCHIVO_HISTORIAL);
        if (!archivo.exists()) {
            return "Aún no hay combates registrados.";
        }
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            return "Error al leer el historial: " + e.getMessage();
        }
        return contenido.toString();
    }
}
