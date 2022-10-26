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
public class punto3 {
    public static void main(String[] args) {
        String nombre, primerasletras;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese el nombre de un pais");
        nombre = captura.next();
        primerasletras= nombre.substring(0, 2);//0 es principio hasta 2-1 como arreglo
        System.out.println("las dos primeras letras del pais es:" + primerasletras);    
        
    }
}
