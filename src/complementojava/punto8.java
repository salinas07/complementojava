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
public class punto8 {

    public static void main(String[] args) {
        int minutos;
        float horasMes;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese la cantidad de minutos");
        minutos = captura.nextInt();

        horasMes = minutos*30 / 60;
        System.out.println("la cantidad de horas invertidos en redes sociales en un mes fueron: "+horasMes);

    }
}
