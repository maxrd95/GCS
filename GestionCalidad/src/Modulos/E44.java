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
public class E44 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int N;
        String n;
        System.out.println("Mostrar el resultado de la siguiente fórmula");
        System.out.println("Ingrese un valor N para S =  1! + 2! + 3! +  ...............+ N!");
        n = ValorPedido.next();
        N = metodo.Entero(n);
        N = metodo.NegativoE(N);
        calcular(N);
    }
    public void calcular(int N){
        double S = 1;
        double contador = 0 ;
        while(contador < N){
            contador++;            
            S = S * contador;
        }        
        System.out.println("El factorial es : " + S);
        metodo.retorno();
    }
}
