
package complementojava;

import java.util.Scanner;


public class punto19 {
    public static void main(String[] args) {
 
        double precio;

        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese el precio del producto");
        precio = captura.nextDouble();
 
        precio = precio + precio*0.3;
        
        System.out.println("el precio que lo debe vender es: "+precio);
        
    }
}
