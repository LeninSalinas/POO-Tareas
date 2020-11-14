/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

import hn.uth.poo.p1.objetos.Recursos;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Recursos recursos=new Recursos();
        
        System.out.println(recursos.mensaje());
        
        System.out.println(recursos.comprobarMayorOMenor());
        int num1, num2;
        System.out.println("Ingrese un numero a multiplicar");
        num1=leer.nextInt();
        System.out.println("Ingrese un numero a multiplicar");
        num2=leer.nextInt();
        System.out.println("El resultado es "+recursos.multiplicacionDosNumeros(num1, num2));
        
        System.out.println("Ingrese un numero");
        int nume=leer.nextInt();
        recursos.numX(nume);
    }
    
}
