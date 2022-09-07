
import java.util.Scanner;

/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese paalabra de 8 digitos");
         System.out.println("");
         String palabra = leer.nextLine();
         
         if (palabra.length() == 8) {
             System.out.println("CORRECTO");
         } else {
             System.out.println("INCORRECTO");
         }
    }
    
}
