
import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

/**
 *
 * @author matia
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Ingrese el valor de N: ");
        int N = leer.nextInt();
        int[] vector = new int [N];
        
        rellenarVector(vector,N);
        calcularDigitos(vector,N);
        
    }
    
      public static void rellenarVector(int[] vector, int N){
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() *10000);
            System.out.println(vector[i]);
        }
      }
        
    public static void calcularDigitos(int [] vector, int N) {
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        for (int i = 0; i < N; i++) {
        String numeros = Integer.toString(vector[i]);
        if (numeros.length() == 1) {
            cont1 = cont1 + 1;
        }
        if (numeros.length() == 2) {
            cont2 = cont2 + 1;
        }
         if (numeros.length() == 3) {
            cont3 = cont3 + 1;
        }
         if (numeros.length() == 4) {
            cont4 = cont4 + 1;
        }
         if (numeros.length() == 5) {
            cont5 = cont5 + 1;
            
        } 
    }
        System.out.println("cantidad de numeros de 1 digito son: " + cont1);
        System.out.println("cantidad de numeros de 2 digito son: " + cont2);
        System.out.println("cantidad de numeros de 3 digito son: " + cont3);
        System.out.println("cantidad de numeros de 4 digito son: " + cont4);
        System.out.println("cantidad de numeros de 5 digito son: " + cont5);
    }
}
    