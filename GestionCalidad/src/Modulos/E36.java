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
public class E36 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        ArrayList<Integer> Numero;
        Numero = new ArrayList<Integer>();  
        String valor;
        int ban=0;
        System.out.println("Encuentre y Muestre la segunda cantidad mayor de las N cantidades positivas ingresadas ");
        System.out.println("Ingrese N cantidades positivas y precione s para cuando desee salir");
        while(ban == 0 ){
            valor = ValorPedido.next();            
            if (("s".equals(valor))||("S".equals(valor))) {
                ban=1;
            }else{
                Numero.add(Integer.parseInt(valor));
            }
        }        
        mostrar(Numero);
    }
    public void mostrar(ArrayList Numeros){
        int contador=0,valorM=0,valor2M=0,valor;
        while(contador < Numeros.size()){
            valor = (int) Numeros.get(contador);
            contador = contador + 1;
            if (valorM <= valor) {
                valor2M = valorM;
                valorM = valor;
            }else if (valor2M<=valor) {
                valor2M = valor;
            }
        }
        System.out.println("El segundo valor mayor es : " + valor2M);
    }
}
