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
public class Ciudadano {
    protected String Nombre;
    protected int Edad;
    protected int AniosDeExperiencia;

    public Ciudadano() {
    }
    
    public Ciudadano(String Nombre, int Edad, int AniosDeExperiencia) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.AniosDeExperiencia = AniosDeExperiencia;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAniosDeExperiencia() {
        return AniosDeExperiencia;
    }

    public void setAniosDeExperiencia(int AniosDeExperiencia) {
        this.AniosDeExperiencia = AniosDeExperiencia;
    }
    
}
