/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementojava;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class punto7 {

    public static void main(String[] args) {
        float estatura, pesoIdeal;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese la estatura(cm)");
        estatura = captura.nextFloat();

        pesoIdeal = (estatura - 100) / 2;
        System.out.println("el peso ideal es: " + pesoIdeal + " Kg");
    }
}
