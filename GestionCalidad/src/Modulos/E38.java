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
public class E38 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Suma_Naturales(){
        int suma,N=9,contador=0;
        suma = (N*(N + 1))/2;
        System.out.println("La suma es : " + suma);
    }
}
