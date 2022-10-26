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
public class punto4 {

    public static void main(String[] args) {
        String nombre, ultimasletras;
        int tamaño;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        nombre = captura.next();
        tamaño = nombre.length();
        ultimasletras = nombre.substring((tamaño-2), tamaño);//0 es principio hasta 2-1 como arreglo
        System.out.println("las dos ultimas letras del nombre son:" + ultimasletras);

    }
}
