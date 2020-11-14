/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2;

import hn.uth.poo.p2.objetos.Ciudadano;
import hn.uth.poo.p2.objetos.PaisElSalvador;
import hn.uth.poo.p2.objetos.PaisEstadosUnidos;
import hn.uth.poo.p2.objetos.PaisGuatemala;
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
        Scanner leer=new Scanner(System.in);
        
        Ciudadano ciudadano=new Ciudadano();
        
        System.out.println("Ingrese su nombre");
        
        ciudadano.setNombre(leer.next());
        
        System.out.println("Ingrese su edad");
        
        ciudadano.setEdad(leer.nextInt());
        
        System.out.println("Ingrese sus Años de experiencia laboral");
        
        ciudadano.setAniosDeExperiencia(leer.nextInt());
        
        PaisElSalvador ElSalvador=new PaisElSalvador("Nayib Buquele", "El salvador");
        
        PaisEstadosUnidos EstadosUnidos=new PaisEstadosUnidos("Donald Trump", "Estados Unidos");
        
        PaisGuatemala Guatemala=new PaisGuatemala("Alejandro Giammattei", "Guatemala");
        
        System.out.println("Mi nombre es: "+ciudadano.getNombre());
        
        System.out.println("Mi edad es: "+ciudadano.getEdad());
        
        System.out.println("Mis anios de experiencia son: "+ciudadano.getAniosDeExperiencia()+" anios\n");
        
        System.out.println("Paises procesados");
        
        System.out.println(ElSalvador.toString());
        
        System.out.println(EstadosUnidos.toString());
        
        System.out.println(Guatemala.toString());
    }
    
}
