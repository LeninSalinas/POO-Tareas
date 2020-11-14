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
public abstract class Pais {
    private String Presidente;
    private String Pais;

    public Pais() {
    }

    public Pais(String Presidente, String Pais) {
        this.Presidente = Presidente;
        this.Pais = Pais;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    @Override
    public String toString(){
        return String.format("El Presidente actual de: %s, es: %s",getPais(),getPresidente());
    }
}
