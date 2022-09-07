
import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     System.out.println("Ingrese numero limite");
     int num = leer.nextInt();
     
     int suma = 0;
        do {
            System.out.println("ingrese un numero");
            suma = (leer.nextInt() + suma);
            
        } while (suma < num);
        System.out.println("Ha superado el limite");
        System.out.println("La suma de los numeros ingresados =" + suma);
        
    }
    
}
