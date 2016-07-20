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
        int nFilas=0;
        String filas;
        System.out.println("Triángulo N filas");
        System.out.println("Ingrese un número de fila para el triángulo");
        
        while(nFilas < 2 || nFilas > 100){
            filas = ValorPedido.next();
            nFilas = metodo.Entero(filas);
            if (nFilas < 2) {
                System.out.println("Ingrese un valor mayor o igual a 2");
            }
            if (nFilas > 100) {
                System.out.println("Ingrese un valor entre 2 y 100");
            }            
        }
        Dibujar(nFilas);
    }
    public void Dibujar(int Filas){
        int filas = Filas + (Filas - 1);                                
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
        metodo.retorno();
    }
}
