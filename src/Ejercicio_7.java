
import java.util.Scanner;

/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese la palabra Clave");
         System.out.println("");
         String clave = leer.nextLine();
                 
                 if (clave.equals("Eureka")) {
                     System.out.println("Correcto");
                 } else {
                     System.out.println("Incorrecto");
                 }
    }
    
}