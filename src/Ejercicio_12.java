
import java.util.Scanner;

/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().

 */

/**
 *
 * @author matia
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   System.out.println("el primer caracter tiene que ser una X y la ultima una O :");
   String palabra = leer.nextLine();
   
   int lon = palabra.length();
   palabra = palabra.toUpperCase();
   int contCorrecto = 0;
   int contIncorrecto = 0;
   
   while (!(palabra.equals("&&&&&"))) {
   
   if (lon == 5 && palabra.substring(0,1).equals("X") && palabra.substring(lon - 1).equals("O")) {
       System.out.println("CORRECTO");
       contCorrecto = contCorrecto + 1;
       
   } else {
       System.out.println("INCORRECTO");
       contIncorrecto = contIncorrecto + 1;
   }
       System.out.println("Si desea salir ingrese &&&&&");
       palabra = leer.nextLine();
   }
   System.out.println("Saliendo del Sistema");
        
   System.out.println("La cantidad de veces ingresada Correctamente es de: " + contCorrecto);
   System.out.println("La cantidad de veces ingresada Incorrectamente es de: " + contIncorrecto);
    }
    
}
