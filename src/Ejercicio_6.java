
import java.util.Scanner;

/*
 Crear un programa que dado un numero determine si es par o impar.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Ingrese numero a validar: ");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("el numero " + num + " es PAR");
            
        } else {
            System.out.println("el numero " + num + " es IMPAR");
        }
        
    }
    
}
