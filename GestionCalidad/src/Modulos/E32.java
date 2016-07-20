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
        int N=1000001;
        String n;
        System.out.println("Múltiplos de 5 entre 1 y N");
        System.out.println("Ingrese un número N");        
        while(N > 1000000){
            n = ValorPedido.next();
            N = metodo.Entero(n);
            N = metodo.NegativoE(N);
            if (N>1000000) {
                System.out.println("Ingrese un valor menor a 1.000.000");
            }
        }
        
        if (N<5) {
            System.out.println("No hay multiplos de 5 para: " +N);
            metodo.retorno();
        }else{
            Mostrar (N);
        }
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
        metodo.retorno();
    }
    
}
