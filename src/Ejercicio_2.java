
import java.util.Scanner;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Por favor ingrese su Nombre");
       String nomb=leer.next();
       
       System.out.println("Nombre: "+nomb+"");
    }
    
}
