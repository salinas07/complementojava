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
public class punto11 {

    public static void main(String[] args) {
        
        float parcial1,parcial2,parcial3,porcentajeParciales,parcialFinal,trabajoFinal;
        float notaFinal;
        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese la nota del parcial 1");
        parcial1 = captura.nextFloat();
        System.out.println("ingrese la nota del parcial 2");
        parcial2 = captura.nextFloat();
        System.out.println("ingrese la nota del parcial 3");
        parcial3 = captura.nextFloat();
        
        porcentajeParciales = (float) (((parcial1+parcial2+parcial3)/3)*0.55);
        System.out.println("la nota promedio de los 3 parciales correspondiente al 55% es: "+porcentajeParciales);
        
        System.out.println("ingrese la nota del parcial Final");
        parcialFinal = captura.nextFloat();
        parcialFinal = (float) (parcialFinal*0.3);
        
        System.out.println("ingrese la nota del trabajo Final");
        trabajoFinal = captura.nextFloat();
        trabajoFinal = (float) (trabajoFinal*0.15);
        
        notaFinal = porcentajeParciales + parcialFinal + trabajoFinal;
        
        System.out.println("su nota final de algoritmo es: "+notaFinal);
        
        

    }
}
