
import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */

/**
 *
 * @author matia
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = leer.nextInt();
        int opc = 0;
        
    do{
        
        System.out.println("Menu: ");
        System.out.println("1- Sumar ");
        System.out.println("2- Restar ");
        System.out.println("3- Multiplicar ");
        System.out.println("4- Dividir ");
        System.out.println("5- Salir ");
        System.out.println("Eliga una opcion: ");
        int opcion = leer.nextInt();
        leer.nextLine();
        
        switch (opcion){
            case 1:
                int suma = num1 + num2;
                System.out.println("La suma de  " + num1 + " y " + num2 + " es =" + suma);
                break;   
            case 2:
                int resta = num1 - num2;
                System.out.println("La resta de  " + num1 + " y " + num2 + " es =" + resta);
                break;   
            case 3:
                int multip = num1 * num2;
                System.out.println("La multiplicacion de  " + num1 + " y " + num2 + " es =" + multip);
                break;
            case 4:
                int divid = num1 / num2;
                System.out.println("La division de  " + num1 + " y " + num2 + " es =" + divid);
                break;
            case 5:
                System.out.println("Desea salir? S/N ");
                String rta = leer.nextLine();
                rta = rta.toUpperCase();
                if (rta.equals("S")) {
                    System.out.println("Muchas Gracias");
                    opc = 5;
                } else {
                    System.out.println("Usted decidio Seguir");
                    opc = 4;
                }
        }
            
    } while (opc != 5);          
           
        }
}
