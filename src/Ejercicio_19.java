
import java.util.Scanner;

/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */

/**
 *
 * @author matia
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int Matriz[][] = new int [3][3];
        
        llenarMatriz(Matriz);
        System.out.println("  ");
        mostrarTranspuesta(Matriz);
       
    }
    
    public static void llenarMatriz(int[][] Matriz){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz[i][j] = leer.nextInt();
            }
            System.out.println("  ");   
        }
    }
    
    public static void mostrarTranspuesta(int[][] Matriz){
        int MatrizT[][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizT[j][i] = Matriz[i][j] * -1;
                System.out.println(MatrizT[j][i] + "  ");  
            }
            System.out.println("  ");
        }  
        
        public static void validacionAntiS(int[][] Matriz){
        if (Matriz.validacionAntiS()) {
            System.out.println("Es una matriz Antisimetrica");
        } else {
            System.out.println("No es una matriz Antisimetrica");
        }
    }
}


    