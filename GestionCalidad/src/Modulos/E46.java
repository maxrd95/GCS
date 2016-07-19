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
public class E46 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int valorPerfecto;
        System.out.println("Número Perfecto de un solo valor ingresado");
        System.out.println("Ingrese el valor para verificar si es o no es perfecto");
        valorPerfecto = ValorPedido.nextInt();
        calculo(valorPerfecto);
    }
    public void calculo(int Valor){
        int suma=0,contador = 1;
        while(contador < Valor){
            
            if (Valor%contador==0) {
                suma = suma + contador;                 
            }
            contador++;
        }
        if (suma==Valor) {
            System.out.println("Valor perfecto " + suma);
        }
    }
}
