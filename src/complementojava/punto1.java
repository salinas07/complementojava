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
public class punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        nombre = captura.next();
        System.out.println("hola " + nombre);

    }
}
