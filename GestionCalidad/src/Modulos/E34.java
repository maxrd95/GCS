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
public class E34 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int N;
        System.out.println("----------Ejercicio 34------------------");
        System.out.println("Ingrese un valor entero");
        N = ValorPedido.nextInt();  
        mostrar(N);
    }
    public void mostrar(int N){
        if (!(N%2==0) && !(N%3==0) && !(N%5==0) && (N%7==0) && (N%11==0) && (N%13==0)) {
            System.out.println("Primo");
        }
        if (N==2 || N==3 || N==5 || N==7 || N==11 || N==13) {
            System.out.println("Primo");
        }
    }
}   
