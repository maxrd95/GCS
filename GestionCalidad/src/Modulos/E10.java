/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import static debergcs.DeberGCS.Menu;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class E10 {
    Scanner numero = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    int vehiculo;
    public void Datos(){
        System.out.println("====Valor a pagar en la carretera dependiendo del vehiculo.====");
        System.out.println("= Calcular el valor a pagar de:                              =");
        System.out.println("= 1.Bicicleta                                                =");
        System.out.println("= 2.Moto                                                     =");
        System.out.println("= 3.Auto                                                     =");
        System.out.println("= 4.Camión                                                  =");
        System.out.println("= 5.Regresar                                                 =");
        System.out.println("==============================================================");
        System.out.println("= Seleccione una opción:                                     =");
        vehiculo = numero.nextInt();
        a:if(vehiculo>4 || vehiculo < 1){
            System.out.println("Ingrese una opción válida: ");
            vehiculo = numero.nextInt();
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
        Datos();
    }
    public void moto(){
        double km,valorPagar;
        String KM;
        System.out.println("Ingrese los km recorridos:");
        KM = numero.next();
        km = metodo.Doble(KM);
        valorPagar = km * 0.30;
        System.out.println("Valor a pagar de su moto : $ " + valorPagar);
        Datos();
    }
    public void carro(){
        double km,valorPagar;
        String KM;
        System.out.println("Ingrese los km recorridos:");
        KM = numero.next();
        km = metodo.Doble(KM);
        valorPagar = km * 0.30;
        System.out.println("Valor a pagar de su auto: $ " + valorPagar);
        Datos();
    }
    public void camion(){
        double km,tm,valorPagar;
        String KM,TM;
        System.out.println("Ingrese los km recorridos:");
        KM = numero.next();
        km = metodo.Doble(KM);
        System.out.println("Ingrese las toneladas méricas:");
        TM = numero.next();
        tm = metodo.Doble(TM);
        valorPagar = (km * 0.50) + (tm * 0.10);
        System.out.println("Valor a pagar de su camión: $ " + valorPagar);
        Datos();
    }
}
