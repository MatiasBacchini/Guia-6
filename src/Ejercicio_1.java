
import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */

/**
 *
 * @author matia
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Pido Dos numeros y muestro la suma");
       System.out.println("Ingrese el primer numero");
       int num = leer.nextInt();
       System.out.println("Ingrese el segundo numero");
       int num2 = leer.nextInt();
       
       int suma = num+num2;
       
       System.out.println("suma: "+ suma);
    }
    
}
