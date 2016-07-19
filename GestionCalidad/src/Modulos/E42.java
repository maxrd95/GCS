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
        int N;
        System.out.println("-----------Ejercicio 42---------------");
        System.out.println("Ingrese un valor N para S =  1/2 +2/4  + 3/6 +  ...............+ N/(N*2) ");
        N = ValorPedido.nextInt();
        calcular(N);
    }
    public void calcular(int N){
        double S=0;
        double contador=0, Div = 0 ;
        while(contador < N){
            contador++;            
            S = S +  (contador/(contador*2));
        }
        System.out.println("El valor de S es : " + S);
    }
}
