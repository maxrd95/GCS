/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class E40 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    DecimalFormat decimales = new DecimalFormat("0.00");
    public void Datos(){
        int A,N=-1;
        String a,n;
        System.out.println("Mostrar el resultado de la siguiente fórmula");
        System.out.println("Ingrese el valor de A y N para la siguiente formula S = ( A - 1)1 + ( A - 2)2 + ( A - 3)3 + ……..( A - N)N");
        System.out.println("Ingrese el valor de A");
        a = ValorPedido.next();
        A = metodo.Entero(a);        
        System.out.println("Igrese el valor de N");
        while(N < 0 || N > 1000000){
            n = ValorPedido.next();
            N = metodo.Entero(n);
            if (N < 0 || N > 100) {
                System.out.println("Ingrese un valor de N de 0 a 100");
            }            
        }
        calcular(A,N);
       
    }
    public void calcular(int A,int N){
        int contador=0;
        double s,S=0;        
        while(contador<N){
            contador++;
            s = (A-contador);
            S = S + Math.pow(s,contador);
        }
        System.out.println("El valor de S es : " + decimales.format(S));
        metodo.retorno();
    }
}
