package complementojava;

import java.util.Scanner;

public class punto13 {

    public static void main(String[] args) {
        int añoAct, mesAct, diaAct;
        int añoNac, mesNac, diaNac, edad;

        Scanner captura = new Scanner(System.in);

        System.out.println("ingrese el dia actual");
        diaAct = captura.nextInt();
        System.out.println("ingrese el mes actual");
        mesAct = captura.nextInt();
        System.out.println("ingrese el año actual");
        añoAct = captura.nextInt();

        System.out.println("ingrese el dia de nacimiento");
        diaNac = captura.nextInt();
        System.out.println("ingrese el mes nacimiento");
        mesNac = captura.nextInt();
        System.out.println("ingrese el año nacimiento");
        añoNac = captura.nextInt();

        edad = añoAct - añoNac;

        if (añoAct > añoNac && mesAct >= mesNac && diaAct > diaNac) {
            System.out.println("su edad es " + edad);
        } else if (añoAct > añoNac && mesAct == mesNac && diaAct == diaNac) {
            System.out.println("hoy estas cumpliendo " + edad + " años no joda");
        } else if (añoAct > añoNac && mesAct <= mesNac && diaAct < diaNac) {
            System.out.println("su edad es " + (edad - 1) + " ya casi cumple años");
        }
    }
}
