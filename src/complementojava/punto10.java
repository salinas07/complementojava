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
public class punto10 {

    public static void main(String[] args) {
        int vaTabla, vaPuntilla, vaRollosLija, vaPegante, vaPintura;
        double canTabla, canPuntilla,canRollosLija, canPegante, canPintura, manoObra,total;
        double totalTabla, totalPuntilla, totalRollosLija, totalPegante, totalPintura,totalInsumos;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("ingrese el precio de una tabla");
        vaTabla = captura.nextInt();
        System.out.println("ingrese la cantidad de tablas");
        canTabla = captura.nextDouble();
        totalTabla = vaTabla * canTabla;
        
        System.out.println("ingrese el precio de la caja de puntillas");
        vaPuntilla = captura.nextInt();
        System.out.println("ingrese la cantidad por cajas de puntillas");
        canPuntilla = captura.nextDouble();
        totalPuntilla = vaPuntilla * canPuntilla;
        
        System.out.println("ingrese el precio del un rollo de lijas");
        vaRollosLija = captura.nextInt();
        System.out.println("ingrese la cantidad por rollo de lija");
        canRollosLija = captura.nextDouble();
        totalRollosLija = vaRollosLija * canRollosLija;
        
        System.out.println("ingrese el precio de la botella de pegante");
        vaPegante = captura.nextInt();
        System.out.println("ingrese la cantidad por botella de pegante");
        canPegante = captura.nextDouble();
        totalPegante = vaPegante * canPegante;
        
        System.out.println("ingrese el precio de la botella de pintura");
        vaPintura = captura.nextInt();
        System.out.println("ingrese la cantidad por botella de pintura");
        canPintura = captura.nextDouble();
        totalPintura = vaPintura * canPintura;
        
        totalInsumos = totalTabla + totalPuntilla + totalRollosLija + totalPegante + totalPintura;
        manoObra =(totalInsumos*0.2);
        total = totalInsumos + manoObra;
        System.out.println("el costo para fabricar la mesa es: "+totalInsumos);
        System.out.println("el costo de la mano de obra es: "+manoObra);
        System.out.println("el costo total es: "+total);
        
    }
}
