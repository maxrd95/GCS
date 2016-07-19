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
public class E40 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int A,N;
        System.out.println("-----------Ejercicio--------------");
        System.out.println("Ingrese el valor de A y N para la siguiente formula S = ( A - 1)1 + ( A - 2)2 + ( A - 3)3 + ……..( A - N)N");
        System.out.println("Ingrese el valor de A");
        A = ValorPedido.nextInt();
        System.out.println("Igrese el valor de N");
        N = ValorPedido.nextInt();
        calcular(A,N);
    }
    public void calcular(int A,int N){
        int S=0,contador=0;        
        while(contador<N){
            contador++;
            S = S + ((A-contador)*contador);
        }
        System.out.println("El valor de S es : " + S);
    }
}
