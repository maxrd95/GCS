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
 */
public class E42 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int N=0;
        String n;
        System.out.println("Mostrar el resultado de la siguiente fórmula");
        System.out.println("Ingrese un valor N para S =  1/2 +2/4  + 3/6 +  ...............+ N/(N*2) ");        
        while(N<0 || N>1000){
            n = ValorPedido.next();
            N = metodo.Entero(n);
            if (N<0 || N>1000) {
                System.out.println("Ingrese un valor de 0 a 1.000");
            }
        }
        calcular(N);
    }
    public void calcular(int N){
        double S=0;
        double contador=0 ;
        while(contador < N){
            contador++;            
            S = S +  (contador/(contador*2));
        }
        System.out.println("El valor de S es : " + S);
        metodo.retorno();
    }
}
