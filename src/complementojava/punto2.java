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
public class punto2 {
    public static void main(String[] args) {
        String animal;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese el nombre de un animal felino sin incluir el puma");
        animal = captura.next();
        System.out.println("habia una vez un " + animal +" que se comio un jabon, ahora es puma"); 
        
    }
 
}
