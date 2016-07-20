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
public class E22 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void Datos(){
        String valor;
        double valorVehiculo;
        int Depreciacion;
        System.out.println("Depreciación del vehiculo por año");
        System.out.println("Ingrese el valor del vehículo");
        valorVehiculo = metodo.Doble(valor = ValorPedido.next());
        System.out.println("Años de depreciación");
        Depreciacion = ValorPedido.nextInt();
        Calculo(Depreciacion,valorVehiculo);
       
    }
    public void Calculo(int Depreciacion, double valorVehiculo){
        int sumatoria;
        double Valor;
        sumatoria = (Depreciacion*(Depreciacion + 1))/2;
        System.out.println(sumatoria);
        for (int i = 0; i < Depreciacion; i++) {            
            Valor = (Depreciacion - i)/(sumatoria * valorVehiculo);
            System.out.println("===== Depreciación " + (i+1) + " año : " + Valor);
            
        }        
   }
}
