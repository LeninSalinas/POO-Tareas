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
public class PaisEstadosUnidos extends Pais{

    public PaisEstadosUnidos() {
    }

    public PaisEstadosUnidos(String Presidente, String Pais) {
        super(Presidente, Pais);
    }
    @Override
    public String toString(){
        return String.format(super.toString());
    }
}
