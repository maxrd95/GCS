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
public class E32 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int N;
        System.out.println("-------------------Ejercicio 32 -------------------------");
        System.out.println("Ingrese un número N");
        N = ValorPedido.nextInt();
        Mostrar (N);
    }
    public void Mostrar(int N){        
        System.out.println("Multiplos de 5 : " );
        for (int i = 0; i <= N; i++) {
            if (i%5==0) {
                if(i!=0){
                    System.out.println(i);
                }
            }
        }        
    }
    
}
