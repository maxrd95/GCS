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
8)	Realice un programa que muestre si un número ingresado es par o impar, positivo o negativo, entero o decimal.
*/
public class E16 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        String Numero;
        System.out.println("--------------Ejercicio 16-------------");
        System.out.println("Ingrese el número que desea evaluar");
        Numero = ValorPedido.next();
        validacion(Numero);
    }
    public void validacion(String Numero){
        double Valor;
        if(Numero.matches("[0-9]*")){
            System.out.println("Entero");
        }else{
            System.out.println("Decimal");
        }
        if (Numero.matches("[.]")) {
            System.out.println("Negativo");
        }else{
            System.out.println("Positivo");
        }
        
    }
}
