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
public class E30 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){     
        int N=0;
        String n;
        System.out.println("Calcular y Mostrar la suma de los números pares comprendidos entre 20 y N");
        System.out.println("Ingrese un número N");
        while(N < 20 || N>1000000000){
            n = ValorPedido.next();
            n = metodo.max(n);
            N = metodo.Entero(n);
            if (N<20) {
                System.out.println("Ingrese un valor N mayor a 20 y menor a 1.000.000.000");
            }
        }
        Mostrar(N);
    }
    public void Mostrar(int N){
        int calcular=0,n2;
        if (!(N%2==0)) {
            N=N-1;
        }
        n2 = N/2;
        calcular = n2 * (n2 + 1);
        calcular = calcular - 90;        
        System.out.println(calcular);
        metodo.retorno();
    }
}
