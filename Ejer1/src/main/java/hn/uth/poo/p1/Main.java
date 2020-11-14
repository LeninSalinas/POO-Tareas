/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

import javax.swing.JOptionPane;

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
        mensaje("Hola, Soy de la clase de Programación Orientada a Objetos");
    }
    public static void mensaje(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
