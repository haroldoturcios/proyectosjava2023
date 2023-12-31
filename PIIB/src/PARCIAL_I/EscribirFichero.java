/*
 * Chimaltenango 5 agosto de 2023.
 * Programador: Haroldo Turcios
 * Descripción del programa: Ejemplo de escritura en un fichero(archivo)
 */
package PARCIAL_I;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFichero {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String cadena;
  
        try (FileWriter fw = new FileWriter("c:/ficheros/datos.txt", true);
            PrintWriter salida = new PrintWriter(fw)) {   
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();                             //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         //se escribe la cadena en el fichero
                cadena = sc.nextLine();                         //se introduce por teclado una cadena de texto    
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());                                                                  
        }          
    }
    
}