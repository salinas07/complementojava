
package complementojava;

import java.util.Scanner;

public class punto15 {
    public static void main(String[] args) {

        double volumen, presion, temperatura, masa;

        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese la presion");
        presion = captura.nextDouble();
        System.out.println("ingrese el volumen");
        volumen = captura.nextInt();
        System.out.println("ingrese la temperatura");
       temperatura = captura.nextInt();

        masa = (presion*volumen)/(0.37*(temperatura + 460));
        
        System.out.println("la masa es: "+masa);
 
    }
}
