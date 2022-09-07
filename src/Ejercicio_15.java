
import java.util.Scanner;

/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int[] vector = new int [100];
     
     inicializarVector(vector);
     System.out.println(vector[0]);
     mostrarVector(vector);
     
    }
    public static void inicializarVector(int[] vector) {
        int cont = 0;
        for (int i = 99; i >= 0; i--) {
            vector[cont] = i;
            cont++;
        }
    }
    public static void mostrarVector(int[] vector) {
        
        System.out.println("Los 100 primeros numeros enteros en forma descendientes son: ");
        
        for (int i = 0; i <= 99; i++) {
            System.out.println(vector[i]);
        }
    }
}

