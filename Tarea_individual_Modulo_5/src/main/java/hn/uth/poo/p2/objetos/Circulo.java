/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2.objetos;

/**
 *
 * @author Dell
 */
public class Circulo extends Formas{
    private double Radio;

    public Circulo() {
    }

    public Circulo(double Radio, String Color) {
        super(Color);
        this.Radio = Radio;
    }    
    
    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }   
    
    public double CalcularRadio(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public String Dibujar(){
        return "El nombre de la figura es "+getClass().getSimpleName();
    }
}
