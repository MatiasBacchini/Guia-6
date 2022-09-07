/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ejercicio_Ext_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n = 0;
        int cPar = 0;
        int cImpar = 0;
        int sum = 0;
        
        do {
            System.out.println("Ingrese numero entero positivo: ");
            n = leer.nextInt();
            if (n < 0) {
                continue;
            }
            if (n % 2 == 0) {
                cPar = cPar + 1;
            } else {
                cImpar = cImpar + 1;
            }
            sum = sum + n;
        } while (! (n % 5 == 0));
        
        System.out.println("los numeros ingresados son: " + (cPar + cImpar));
        System.out.println("los numeros Pares ingresados son: " + cPar);
        System.out.println("los numeros Impares ingresados son: " + cImpar);
        System.out.println("la suma de todos los numeros ingresados es: " + sum);
    }
    
}
