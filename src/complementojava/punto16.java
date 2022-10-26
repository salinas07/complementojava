
package complementojava;

import java.util.Scanner;

public class punto16 {
    public static void main(String[] args) {
        
        int edad;
        double numPulsa;

        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese la edad");
        edad = captura.nextInt();

        numPulsa = (220 - edad)/10;
        
        System.out.println("el numero de pulsaciones en diez segundos es: "+numPulsa);
        
        
    }
}
