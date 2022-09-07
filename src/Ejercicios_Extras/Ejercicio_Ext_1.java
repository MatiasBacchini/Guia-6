/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ejercicio_Ext_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        int dia = 1440;
        int hora = 60;
        int resultadoDia;
        int resultadoHora;
        
        System.out.println("Ingrese tiempo en minutos");
        int minutos = leer.nextInt();
        
        resultadoDia = minutos / dia;
        resultadoHora = minutos % dia;
        
        System.out.println(+minutos+ " minutos equivale a " +resultadoDia+ " dias y " +resultadoHora/hora+ " horas");
        
                

         }
            
}    
