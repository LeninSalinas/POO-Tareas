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
public class Linea extends Formas{
    public double Largo;

    public Linea() {
    }

    public Linea(double Largo, String Color) {
        super(Color);
        this.Largo = Largo;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }
    
    public String Dibujar(){
        return "El nombre de la figura es "+getClass().getSimpleName();
    }
}
