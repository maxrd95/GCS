/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.util.Scanner;

/**
 * 10)	Pida por teclado cuantos billetes de 100, 20, 10, 5 y 1 tiene la persona en el bolsillo. 
 * Ahora pida por teclado cuanto vale un artículo, el programa debe decir si tiene el dinero suficiente para comprarlo 
 * y cuanto sería el vuelto, si le hace falta debe salir un aviso diciendo: 
 * "te falta dinero" y debe decir cuanto le falta.
 */
public class E20 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        int Billetes100,Billetes20,Billetes10,Billetes5,Billetes1;
        String ValorArticulo;
        double valorArticulo;
        System.out.println("------------------Ejercicio 20-----------------");
        System.out.println("Pedir cuantos billetes de 100, 20, 10, 5 y 1 tiene la persona en el bolsillo");
        System.out.println("Billetes de 100");
        Billetes100 = ValorPedido.nextInt();
        System.out.println("Billetes de 20");
        Billetes20 = ValorPedido.nextInt();
        System.out.println("Billetes de 10");
        Billetes10 = ValorPedido.nextInt();
        System.out.println("Billetes de 5");
        Billetes5 = ValorPedido.nextInt();
        System.out.println("Billetes de 1");
        Billetes1 = ValorPedido.nextInt();
        System.out.println("Valor del articulo");
        valorArticulo = metodo.Doble(ValorArticulo = ValorPedido.next());
        calcular(Billetes100,Billetes20,Billetes10,Billetes5,Billetes1,valorArticulo);
    }
    public void calcular(int B100,int B20,int B10, int B5, int B1, double valor){
        int suma;
        double vuelto;
        suma = (B100 * 100) + (B20 * 20) + (B10 * 10) + (B5 * 5) + (B1 * 1);
        if (valor < suma) {
            vuelto = suma - valor;
            System.out.println("Su vuelto es : " + vuelto);
        }else{
            vuelto = valor - suma;
            System.out.println("Te falta dinero " + vuelto);
        }
    }
}
