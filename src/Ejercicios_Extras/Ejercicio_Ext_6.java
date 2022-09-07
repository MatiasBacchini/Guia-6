/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ejercicio_Ext_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int i, N; 
      int contMas = 0, contMenos = 0; 
      double media = 0; 
      
      do{ System.out.print("Número de personas: "); 
      N = leer.nextInt();
      
      } while(N <= 0);
        double[] alto = new double[N];
        System.out.println("Altura de las personas: ");
      
      for (i = 0; i < N; i++) {
          System.out.print("persona " + (i + 1) + " = "); alto[i] = leer.nextDouble(); media = media + alto[i];
      }
      media = media / N;
      for (i = 0; i < alto.length; i++) { 
          if (alto[i] > media){
          contMas++;
      } else if (alto[i] <= media){
          contMenos++;
      }
    }
      System.out.println("Estatura media: " + media);
      System.out.println("Personas con estatura superior a la media: " + contMas); 
      System.out.println("Personas con estatura inferior a la media: " + contMenos);
    }
    
}
