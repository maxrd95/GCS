/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class E26 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int [] numeros = new int[20];
        ArrayList<Integer> Numero;
        Numero = new ArrayList<Integer>();        
        String salir;
        System.out.println("--------------ejercicio 26-------------");
        System.out.println("Ingrese números y para salir escriba s");
        for (int i = 0; i < 20; i++) {
            salir = ValorPedido.next();            
            
            if ("s".equals(salir)) {
                i = 20;
            }else{
                Numero.add(Integer.parseInt(salir));
            }            
        }
        Calcular(Numero);
        
    }
    public void Calcular(ArrayList Numeros){
        int suma = 0,valor,valorMedio;
        for (int i = 0; i < Numeros.size(); i++) {
            valor = (int) Numeros.get(i);      
            suma = valor + suma;            
        }
        valorMedio = suma/Numeros.size();
        System.out.println("La suma total es : " + suma);
        System.out.println("El valor medio es : " + valorMedio);
    }
}
