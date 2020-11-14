/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

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
        //NUMEROS PARES
       int num=0;
        for (num = 2; num < 100; num++) {
            if(num%2==0){
            System.out.println(num);
           }
        }        
    }       
}
