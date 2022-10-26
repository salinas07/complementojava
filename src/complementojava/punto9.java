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
public class punto9 {

    public static void main(String[] args) {
        int valorHora = 3800;
        int horasSemanas;
        int salarioMes;
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese la cantidad de horas en la semana");
        horasSemanas = captura.nextInt();

        salarioMes = horasSemanas * valorHora * 4;
        System.out.println("el salario mensual es: " + salarioMes);

    }

}
