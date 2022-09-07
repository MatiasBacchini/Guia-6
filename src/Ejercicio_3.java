

import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba su Frase");
        String Frase = leer.nextLine();
    
        System.out.println(Frase.toUpperCase());
        System.out.println(Frase.toLowerCase());
    }
    
}
