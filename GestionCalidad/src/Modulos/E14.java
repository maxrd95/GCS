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
/*
                    7)	Ingresar tres números y mostrar el menor o el mayor, según el usuario decida.
*/
public class E14 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){        
        double numero1,numero2,numero3;
        String N1,N2,N3;
        System.out.println("------------------Ejercicio 14-----------------------");
        System.out.println("Ingrese 3 números para calcular el mayor o el menor");
        System.out.println("Primer número");
        N1 = ValorPedido.next();
        numero1 = metodo.Doble(N1);        
        System.out.println("Segundo número");
        N2 = ValorPedido.next();
        numero2 = metodo.Doble(N2);        
        System.out.println("Tercer número");
        N3 = ValorPedido.next();
        numero3 = metodo.Doble(N3);               
        mostrar(numero1,numero2,numero3);
    }
    public void mostrar(double numero1,double numero2,double numero3){
        int eleccion;
        System.out.println("======Cual numero desea ver=====");
        System.out.println("========1)Mayor            =====");
        System.out.println("========2)Menor            =====");
        System.out.println("==Elija una de las 2 opciones==");
        eleccion = ValorPedido.nextInt();                
        if(eleccion==1){
           if(numero1 > numero2 && numero1 > numero3){
               System.out.println("El mayor es : " + numero1);
           }else if(numero2 > numero3){
               System.out.println("El mayor es : " + numero2);
           }else{
               System.out.println("El mayor es : " + numero3);
           }           
        }else{
            if(numero1 < numero2 && numero1 < numero3){
               System.out.println("El menor es : " + numero1);
           }else if(numero2 < numero3){
               System.out.println("El menor es : " + numero2);
           }else{
               System.out.println("El menor es : " + numero3);
           }         
        } 
        metodo.retorno();
    }
}
