/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1;

import java.util.Scanner;

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
        Scanner lector=new Scanner(System.in);
        String nombreCiudades[]={"La Ceiba","Tela","Tegucigalpa","Comayagua","Copan","Danli","Choloma","Intibuca","Yoro","Tocoa","Trujillo","San pedro Sula","El progreso"
        ,"Puerto Cortes","Roatan","Islas Caiman","Miami","La Esperanza","Comayaguela","Saba"};
        for (int i = 0; i < nombreCiudades.length; i++) {
          
            System.out.println(i+". "+nombreCiudades[i]+"\n");
            
        }
    }
    
}
