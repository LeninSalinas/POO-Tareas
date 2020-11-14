/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2;

import hn.uth.poo.p2.objetos.Circulo;
import hn.uth.poo.p2.objetos.Cuadrado;
import hn.uth.poo.p2.objetos.Formas;
import hn.uth.poo.p2.objetos.Linea;
import hn.uth.poo.p2.objetos.Triangulo;
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
        Scanner scanner=new Scanner(System.in,"ISO-8859-1").useDelimiter("\\n");
        try {
            Formas figura=new Formas();
            System.out.println("El color de la figura actual es Amarillo");
            System.out.println("Ingrese el nuevo color de la figura");
            figura.EstablecerColor(scanner.next());
            System.out.println("El color de la figura actual es "+figura.getColor());
            System.out.println(figura.Dibujar());
            
            Circulo circulo=new Circulo();
            System.out.println("Para calcular el radio del circulo se necesita calcular el radio\nIngrese un numero a calcular");
            circulo.setRadio(scanner.nextInt());
            double result=circulo.CalcularRadio(circulo.getRadio());
            System.out.println("El radio del circulo es de: "+result);
            System.out.println(circulo.Dibujar());
            
            Linea linea=new Linea(7.22, "Negro");   
            System.out.println("La linea mide "+linea.getLargo());
            System.out.println("El color de la linea es "+linea.getColor());
            System.out.println(linea.Dibujar());
            
            Triangulo triangulo=new Triangulo();
            int lado1,lado2,lado3;
            System.out.println("Para calcular el angulo del triangulo se necesita calcular el angulo\nIngrese un numero a calcular");
            lado1=scanner.nextInt();
            System.out.println("Ingrese otro numero");
            lado2=scanner.nextInt();
            System.out.println("Ingrese otro numero");
            lado3=scanner.nextInt();
            int resultado=triangulo.CalcularAngulo(lado1,lado2,lado3);
            System.out.println("El angulo del triangulo es de: "+resultado);
            System.out.println(triangulo.Dibujar());
            
            Cuadrado cuadrado=new Cuadrado();
            int num1,num2;
            System.out.println("Para calcular el angulo del cuadrado se necesita calcular el area\nIngrese un numero a calcular");
            num1=scanner.nextInt();
            System.out.println("Ingrese otro numero");
            num2=scanner.nextInt();
            int answer=cuadrado.CalcularArea(num1,num2);
            System.out.println("El angulo del cuadrado es de: "+answer);
            System.out.println(cuadrado.Dibujar());
            
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
    }
    
}
