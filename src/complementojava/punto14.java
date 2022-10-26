
package complementojava;

import java.util.Scanner;

public class punto14 {
    public static void main(String[] args) {
        
        int monto;
        double totalDolar, uniCamb;

        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese la unidad cambiaria en pesos ejm 1 dolar = 3500 pesos");
        uniCamb = captura.nextDouble();
        System.out.println("ingrese el monto en pesos");
        monto = captura.nextInt();

        totalDolar = monto/uniCamb;
        
        System.out.println("la cantidad en dolares es: "+totalDolar);

    }
}
