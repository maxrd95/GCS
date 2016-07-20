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
        int numeroTabla=10;
        String numero;
        System.out.println("Realice un programa que liste la tabla de sumar entre el 0 y 9 de cualquier número ingresado");
        System.out.println("Ingrese el número del que desea ver la tabla de sumar");
        
        while(numeroTabla < 0 || numeroTabla >9){
            numero = ValorPedido.next();
            numeroTabla = metodo.Entero(numero);
            if (numeroTabla < 0 || numeroTabla >9) {
                System.out.println("Ingrese un valor 0-9");
            }
        }
        mostrar(numeroTabla);
    }
    public void mostrar(int tabla){
        int total;
        System.out.println("Tabla de suma del : " + tabla);
        for (int i = 0; i < 10; i++) {
            total = i + tabla;
            System.out.println(i + " + " + tabla + " = " + total);
        }
        metodo.retorno();
    }
}
