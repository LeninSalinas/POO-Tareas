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
public class Formas {
    private String Color;

    public Formas() {
    }

    public Formas(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void EstablecerColor(String Color) {
        this.Color = Color;
    }
    public String Dibujar(){
        return "El nombre de la figura es "+getClass().getSimpleName();
    }
}
