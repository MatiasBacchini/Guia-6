
import java.util.Scanner;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */

/**
 *
 * @author matia
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        int Matriz[][] = new int [4][4];  
    
        llenarMatriz(Matriz);
        System.out.println("  ");
        mostrarTranspuesta(Matriz);
    }
    
    public static void llenarMatriz(int[][] Matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Matriz[i][j] = (int)(Math.random()*20);
                System.out.print(Matriz[i][j] + "  ");
            }
            System.out.println("  ");
        }
    }
    public static void mostrarTranspuesta(int[][] Matriz) { 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Matriz[j][i] + "  ");
            }
            System.out.println("  ");  
        }
    }
    
}
