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
public class Triangulo extends Formas{
    public int Angulo;

    public Triangulo() {
    }

    public Triangulo(int Angulo, String Color) {
        super(Color);
        this.Angulo = Angulo;
    }

    public int getAngulo() {
        return Angulo;
    }

    public void setAngulo(int Angulo) {
        this.Angulo = Angulo;
    }    
    
    public int CalcularAngulo(int anguloA,int anguloB,int anguloC){
        return anguloA+anguloB+anguloC;
    }
    
    public String Dibujar(){
        return "El nombre de la figura es "+getClass().getSimpleName();
    }
}
