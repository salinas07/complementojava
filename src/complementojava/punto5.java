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
public class punto5 {

    public static void main(String[] args) {
        String primerNombre, primerApellido, dominio, primerasLetrasN;
        String primerasLetrasA;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese el primer nombre");
        primerNombre = captura.next();
        System.out.println("ingrese el primer apellido");
        primerApellido = captura.next();
        System.out.println("ingrese el dominio ejem: hotmail.com, gmail.com, etc.");
        dominio = captura.next();
        primerasLetrasN = primerNombre.substring(0, 2);
        primerasLetrasA = primerApellido.substring(0, 2);
        System.out.println("el correo será: " + primerasLetrasN + "" + primerasLetrasA + "@" + dominio);
    }
}
