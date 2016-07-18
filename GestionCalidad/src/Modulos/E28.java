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
public class E28 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int nFilas;
        System.out.println("-------------Ejercicio 28-----------------");
        System.out.println("Ingrese filas para el triangulo");
        nFilas = ValorPedido.nextInt();
        Dibujar(nFilas);
    }
    public void Dibujar(int Filas){
        int filas = Filas + (Filas - 1);                        
        
        /*if (filas%2 == 0) {                
                while(impares < Filas){
                    impares = impares + 2;
                    counImpar = counImpar + 2;
                }
                dibujando = Filas + counImpar;                            
            
            } else {
                while(pares < Filas){
                    pares = pares + 2;
                    counPar = counPar + 2;
                }
                dibujando = Filas + counPar;                
            }
        */
        
        for (int i = 0; i < Filas; i++) {            
            int contador = 0,ban = i;            
            String dibujo = "", espacios = "";            
            while(contador < filas){
                contador=contador + 1;                    
                for (int j = 0; j < ban; j++) {
                    espacios = espacios + " ";
                }
                ban=0;
                dibujo =  dibujo + "*";                
            }                        
            filas= filas - 2;                                
            System.out.println(espacios+dibujo);
        }
    }
}
