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
        int N;
        System.out.println("Calcular y Mostrar la suma de los números pares comprendidos entre 20 y N");
        System.out.println("Ingrese un número N");
        N = ValorPedido.nextInt();
        Mostrar(N);
    }
    public void Mostrar(int N){
        int calcular=0;
        for (int i = 20; i < N; i = i+2) {
            calcular = calcular + i;
        }
        System.out.println(calcular);
        
    }
}
