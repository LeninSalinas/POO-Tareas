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
public class Cuadrado extends Formas{
    
    public int Area;

    public Cuadrado() {
    }

    public Cuadrado(int Area, String Color) {
        super(Color);
        this.Area = Area;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }
    public int CalcularArea(int lado1,int lado2){
        return lado1*lado2;
    }
    
    public String Dibujar(){
        return "El nombre de la figura es "+getClass().getSimpleName();
    }
}
