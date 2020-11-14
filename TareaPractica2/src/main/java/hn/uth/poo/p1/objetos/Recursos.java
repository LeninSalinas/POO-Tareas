/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.objetos;

/**
 *
 * @author Dell
 */
public class Recursos {
    public static String mensaje(){
        return "Estoy aprendiendo, pero seré el mejor programador";
    }
    public static String comprobarMayorOMenor(){
        float edadEstudiante=20;
        if (edadEstudiante>20) {
            return "El estudiante es mayor que 18";
        }else
            return "El estudiante es menor que 18";
    } 
    public static int multiplicacionDosNumeros(int num1, int num2){
        return num1*num2;
    }
    public static int numX(int x){
        return 0;
    }
}
