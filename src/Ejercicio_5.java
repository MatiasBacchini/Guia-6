

import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */

/**
 *
 * @author matia
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int num;
    System.out.println("Ingrese numero entero");
    num = leer.nextInt();
    System.out.println("Numero ingresado: " + num);
    System.out.println("Doble de: " + num +" = "+ 2*num);
    System.out.println("Triple de: " + num +" = "+ 3*num);
    
    double raizCuadrada = Math.sqrt(3*num);
    System.out.println("Raiz cuadrada es: " + 3*num + " = "+raizCuadrada);
    
    }
    
}
