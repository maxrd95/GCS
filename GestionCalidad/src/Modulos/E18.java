/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.util.Scanner;

/**
 *
 * @author Riden
 *
 * 
 9)	Hacer un programa que pida una letra por teclado y luego un número (dos variables), si la letra digitada es C 
                    entonces significa que el número representa grados centígrados, así que lo convierte a grados Fahrenheit, 
                    si la letra digitada es F entonces significa que el número representa grados Fahrenheit, 
                    así que lo convierte a grados centígrados. Si digitó una letra distinta entonces saque un mensaje de error 
                    diciendo que solo puede digitar C o F.        
            */
public class E18 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        String Grado,ValorGrado;
        double valorGrado;
        System.out.println("Grados Centigrados a Fahrenheit o Viceversa");
        System.out.println("Ingrese C para grados centígrados o F para grados Fahrenheit");
        Grado = ValorPedido.next();
        while(!("c".equals(Grado)) && !("f".equals(Grado)) && !("F".equals(Grado)) && !("C".equals(Grado))){
            System.out.println("Ingrese un valor válido c o f");
            Grado = ValorPedido.next();        
        }               
        System.out.println("Ingrese el valor del grado");        
        valorGrado = metodo.Doble(ValorGrado = ValorPedido.next());
        
    }
    public void Convertir(String Grado,double valor){
        if(("c".equals(Grado)) || "C".equals(Grado)){
            //valor = valor 
            System.out.println("El valor en grados Fahrenheit es : " + valor);
        }else {
            //valor = valor
            System.out.println("El valor en grados centígrados es : " + valor);
        }
        
    }
}
