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
        int M = 6, T = 1, K = -10;
        System.out.println("Primera evaluacion");
        
        if(M > T){
            System.out.println(M+" > "+T+" El resultado es verdadero");
        }else System.out.println(T+" > "+M+" El resultado es falso");
        
        System.out.println("Segunda evaluacion");
        
        if(T / K == -5){
            System.out.println(T+" dividido entre "+K+" es igual a -5 el resultado es verdadero");
        }else System.out.println(T+" dividido entre "+K+" es igual a -5 el resultado es falso");
        
        System.out.println("Tercera evaluacion");
        
        if(M+T == 7 || M-T == 5){
            System.out.println(M+" mas( + ) "+K+" es igual a 7 "+" o "+M+" menos( - ) "+K+" es igual a 5 "+" el resultado es verdadero");
        }else System.out.println(M+" mas( + ) "+K+" es igual a 7 "+" o "+M+" menos( - ) "+K+" es igual a 5 "+" el resultado es falso");
    }
    
}
