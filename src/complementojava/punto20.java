
package complementojava;

import java.util.Scanner;


public class punto20 {
    public static void main(String[] args) {

        double persona1, persona2, persona3, total, por1, por2, por3;
        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese cantidad de la primera persona");
        persona1 = captura.nextDouble();
        System.out.println("ingrese cantidad de la segunda persona");
        persona2 = captura.nextDouble();
        System.out.println("ingrese cantidad de la tercera persona");
        persona3 = captura.nextDouble();


        total = persona1 + persona2 + persona3;
        por1 = persona1*100/total;
        por2 = persona2*100/total;
        por3 = persona3*100/total;
        
        System.out.println("el porcentaje respecto a lo invertido de la persona 1 es: "+por1);
        System.out.println("el porcentaje respecto a lo invertido de la persona 2 es: "+por2);
        System.out.println("el porcentaje respecto a lo invertido de la persona 3 es: "+por3);
    }
}
