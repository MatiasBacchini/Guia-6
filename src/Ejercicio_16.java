
import java.util.Scanner;

/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */

/**
 *
 * @author matia
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño de N: ");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
            
        rellenarVector(vector,N);
        buscarNumero(vector);
        
    }
    public static void rellenarVector(int[] vector, int N){
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() *N);
            System.out.println(vector[i]);
        }
    }
    public static void buscarNumero(int[] vector){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrese numero a buscar: ");
       int num = leer.nextInt();
       int cont = 0;
       
       for (int i = 0; i < vector.length; i++){
           if (num == vector[i]) {
               System.out.println("El numero " + num + "se encuentra en la posicion " + (i + 1));
               cont = cont + 1;
           }
       }
       if (cont > 1) {
           System.out.println("El numero esta repetido");
           
       } else {
           System.out.println("El numero no esta repetido");
       }
    }
}
