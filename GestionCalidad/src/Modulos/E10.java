/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import static debergcs.DeberGCS.Menu;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class E10 {
    Scanner numero = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    DecimalFormat decimales = new DecimalFormat("0.00");
    int vehiculo;
    public void Datos(){
        String Vehiculo;
        System.out.println("====Valor a pagar en la carretera dependiendo del vehiculo.====");
        System.out.println("= Calcular el valor a pagar de:                              =");
        System.out.println("= 1.Bicicleta                                                =");
        System.out.println("= 2.Moto                                                     =");
        System.out.println("= 3.Auto                                                     =");
        System.out.println("= 4.Camión                                                  =");        
        System.out.println("==============================================================");
        System.out.println("= Seleccione una opción:                                     =");
        Vehiculo = numero.next();
        vehiculo = metodo.Entero(Vehiculo);
        vehiculo = metodo.NegativoE(vehiculo);
        a:if(vehiculo>4 || vehiculo < 1){
            System.out.println("Ingrese una opción válida: ");
            Vehiculo = numero.next();
            vehiculo = metodo.Entero(Vehiculo);
            vehiculo = metodo.NegativoE(vehiculo);;
            break a;
        }
        switch (vehiculo) {
            case 1: bicicleta();                    
                    break;
            case 2: moto();                    
                    break;
            case 3: carro();
                    break;
            case 4: camion();
                    break;   
            case 5: Menu();
                    break;
            default: System.out.println("Ingrese uno de los valores en la tabla");
                     break;
        }
        
    }
    public void bicicleta(){
        System.out.println("Valor a pagar de su bicicleta : $0.50");
        metodo.retorno();
    }
    public void moto(){
        double km=0,valorPagar;
        String KM;
        System.out.println("Ingrese los km recorridos:");
        while(km<=0){
            KM = numero.next();
            km = metodo.Doble(KM);
            km = metodo.NegativoD(km);
            if (km<=0) {
                System.out.println("EL km no puede ser 0");
            }
        }        
        valorPagar = km * 0.30;
        System.out.println("Valor a pagar de su moto : $ " + decimales.format(valorPagar));
        metodo.retorno();
    }
    public void carro(){
        double km=0,valorPagar;
        String KM;
        System.out.println("Ingrese los km recorridos:");
        while(km<=0){
            KM = numero.next();
            km = metodo.Doble(KM);
            km = metodo.NegativoD(km);
            if (km<=0) {
                System.out.println("EL km no puede ser 0");
            }
        }
        
        valorPagar = km * 0.30;        
        System.out.println("Valor a pagar de su auto: $ " + decimales.format(valorPagar));
        metodo.retorno();
    }
    public void camion(){
        double km=0,tm=0,valorPagar;
        String KM,TM;
        System.out.println("Ingrese los km recorridos:");
        while(km<=0){
            KM = numero.next();
            km = metodo.Doble(KM);
            km = metodo.NegativoD(km);
            if (km<=0) {
                System.out.println("EL km no puede ser 0");
            }
        }
        System.out.println("Ingrese las toneladas métricas:");        
        TM = numero.next();
        tm = metodo.Doble(TM);
        tm = metodo.NegativoD(tm);                    
        valorPagar = (km * 0.50) + (tm * 0.10);        
        System.out.println("Valor a pagar de su camión: $ " + decimales.format(valorPagar));
        metodo.retorno();
    }
}
