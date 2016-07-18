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
public class E24 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int numeroTabla;
        System.out.println("----------Ejercicio 24----------------");
        System.out.println("Ingrese el número del que desea ver la tabla de sumar");
        numeroTabla = ValorPedido.nextInt();
        mostrar(numeroTabla);
    }
    public void mostrar(int tabla){
        int total;
        System.out.println("Tabla de suma del : " + tabla);
        for (int i = 0; i < 10; i++) {
            total = i + tabla;
            System.out.println(i + " + " + tabla + " = " + total);
        }
    }
}
