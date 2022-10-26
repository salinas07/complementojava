
package complementojava;

import java.util.Scanner;


public class punto18 {
    public static void main(String[] args) {
        
        int monto;
        double gine, trauYpedia;
        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese el monto presupuestal");
        monto = captura.nextInt();
        
        gine = monto*0.4;
        trauYpedia= monto*0.3;
        
        System.out.println("Ginecolocia recibirá: "+gine);
        System.out.println("traumatologia recibirá: "+trauYpedia);
        System.out.println("pediatria recibirá: "+trauYpedia);
        
    }
}
