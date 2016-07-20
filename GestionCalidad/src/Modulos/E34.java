/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class E34 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    DecimalFormat decimales = new DecimalFormat("0.000");
    public void Datos(){                
        int N;
        String n;
        System.out.println("Ingreso de un valor entero e indique si dicho valor es primo o no");
        System.out.println("Ingrese el valor entero");        
        n = ValorPedido.next();   
        n = metodo.max(n);
        N = metodo.Entero(n);
        N = metodo.NegativoE(N);
        mostrar(N);
    }
    public void mostrar(int N){
        if (!(N%2==0) && !(N%3==0) && !(N%5==0) && (N%7==0) && (N%11==0) && (N%13==0)) {
            System.out.println("Primo");
        }
        if (N==2 || N==3 || N==5 || N==7 || N==11 || N==13) {
            System.out.println("Primo");
        }
        metodo.retorno();
    }
}   
