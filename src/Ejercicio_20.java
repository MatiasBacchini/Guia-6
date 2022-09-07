
import java.util.Scanner;

/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int matriz[][] = new int[3][3];
        
        rellenarCuadrado(matriz);
        validarSumaCuadrado(matriz);
    }
    
    public static void rellenarCuadrado(int[][] matriz) {
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {  
                matriz[i][j] = leer.nextInt();
            }
        }
    }    
        
    public static void validarSumaCuadrado(int[][] matriz) {
         Scanner leer = new Scanner(System.in);
         
         int sumf1 = 0;
         int sumf2 = 0;
         int sumf3 = 0;
         int sumc1 = 0;
         int sumc2 = 0;
         int sumc3 = 0;
         int sumd1 = 0;
         int sumd2 = 0;
         
        for (int j = 0; j < 3; j++) {
            sumf1 = sumf1 + matriz[0][j];
            sumf2 = sumf2 + matriz[1][j];
            sumf3 = sumf3 + matriz[2][j];
        }
        for (int i = 0; i < 3; i++) {
            sumc1 = sumc1 + matriz[i][0];
            sumc2 = sumc2 + matriz[i][1];
            sumc3 = sumc3 + matriz[i][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; i++) {
                if (i == j) {
                    sumd1 = sumd1 + matriz [i][j];
                }
                if (i + j == 2){
                    sumd2 = sumd2 + matriz [i][j];
                }
            }
            
            if (sumf1 == sumf2 && sumf2 == sumf3 && sumf3 == sumc1 && sumc1 == sumc2 && sumc2 == sumc3 && sumc3 == sumd1 && sumd1 == sumd2){
                System.out.println("La matriz es MAGICA la suma de todos sus columnas, filas y diagonales dan: ");
            } else{
                System.out.println("La matriz NO es magica");
        }
        System.out.println("sumf1");
        System.out.println("sumf2");
        System.out.println("sumf3");
        System.out.println("sumc1");
        System.out.println("sumc2");
        System.out.println("sumc3");
        System.out.println("sumd1");
        System.out.println("sumd2");
    }
    }
}