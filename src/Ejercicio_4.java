
import java.util.Scanner;

/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

/**
 *
 * @author matia
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     double gradosC, gradosF;
         System.out.println("Introduce grados Centígrados:");
         gradosC = leer.nextDouble();
         gradosF = 32 + (9 * gradosC / 5);
         System.out.println(gradosC +" ºC = " + gradosF + " ºF");   
    }
    
}