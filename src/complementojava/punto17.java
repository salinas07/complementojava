
package complementojava;

import java.util.Scanner;


public class punto17 {
    public static void main(String[] args) {
        
        double salario;

        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese el salario");
        salario = captura.nextDouble();

        salario= salario*0.25 + salario;
        
        System.out.println("su salario con incremento es: "+salario);
        
    }
}
