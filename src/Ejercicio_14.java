
import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

/**
 *
 * @author matia
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de Euros a convertir");
        double euro = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese a que moneda quiere convertir");
        String moneda = leer.nextLine();
        
        moneda = moneda.toUpperCase();
        cambio (euro,moneda);
    }
    public static void cambio (double euro, String moneda){
        switch (moneda){
            case "DOLAR":
                double cambio = euro * 1.28611;
                System.out.println("El cambio de " + euro + " a dolar es = " + cambio);
                break;
            case "LIBRA":
                double cambioo = euro * 0.86;
                System.out.println("El cambio de " + euro + " a libra es = " + cambioo);
                break;
            case "YEN":
                double cambiooo = euro * 129.852;
                System.out.println("El cambio de " + euro + " a yen es = " + cambiooo);
                break;
        }
    }
}
