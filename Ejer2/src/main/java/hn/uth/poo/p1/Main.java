/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

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
        Scanner capturador=new Scanner(System.in);
        int num1=0,num2=0,suma,resta,multiplicacion;
        double division=0.0;
        System.out.println("Ingrese un numero");
        num1=capturador.nextInt();
        System.out.println("Ingrese un numero");  
        num2=capturador.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        System.out.println(num1+" + "+num2+" = "+suma+"\n"+num1+" - "+num2+" = "+resta+"\n"+num1+" x "+num2+" = "+multiplicacion+"\n"
                +num1+" / "+num2+" = "+division);
    }
    
}
