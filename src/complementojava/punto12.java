
package complementojava;

import java.util.Scanner;


public class punto12 {
    public static void main(String[] args) {
        double numeroH, numeroM, cantidadTotal;
       // double porcentajeH, porcentajeM;
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de Hombres");
        numeroH = captura.nextInt();
        System.out.println("ingrese la cantidad de mujeres");
        numeroM = captura.nextInt();
        
        cantidadTotal = numeroH + numeroM;
        numeroH =100*numeroH/cantidadTotal;
        numeroM =100*numeroM/cantidadTotal;
        
        System.out.println("el porcentaje de hombres es: "+numeroH+" %");
        System.out.println("el porcentaje de mujeres es: "+numeroM+" %");
    }
}
