/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debergcs;


import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class DeberGCS {
     
     public static void Menu(){
        Scanner numero = new Scanner(System.in);          
        Metodo.Metodos metodo = new Metodo.Metodos();
        int valor;    
        String cadena;     
        System.out.println("============Menú=============");
        System.out.println("===== 1.-  Millas Marinas======");
        System.out.println("===== 2.-  Área y el perímetro de un triángulo rectángulo ======");
        System.out.println("===== 3.-  Área y el perímetro de un triángulo rectángulo ======");
        System.out.println("===== 4.- Consumo de conbustible  ======");
        System.out.println("===== 5.- Consumo de conbustible  ======");
        System.out.println("===== 6.- Ganancia neta de un trabajador  ======");
        System.out.println("==Elige la opccion del Menu==");             
        cadena =numero.next();
        cadena = metodo.max(cadena);
        cadena = metodo.ValorEntero("t",cadena);       
        valor = Integer.parseInt(cadena);
        switch (valor) {
            /*Diseñar un programa que lea el valor correspondiente a una distancia en millas marinas y 
            las escriba expresadas en metros y en kilómetros. Sabiendo que 1 milla marina equivale a 1852 metros.*/
            case 1: Modulos.E2 e2 = new Modulos.E2();
                    e2.Millas_M();
                    break;
            /*2)	Diseñar un programa que calcule el área y 
                    el perímetro de un triángulo rectángulo dada la base y la altura.*/
            case 2: Modulos.E4 e4 = new Modulos.E4();
                    e4.E4();
                    break;
            /*3)	Dado un tiempo en minutos, calcular los días, horas y minutos que le corresponden.*/
            case 3: Modulos.E6 e6 = new Modulos.E6();
                    e6.E6();
                    break;
            /*4)	Diseñar un programa que ingrese el total de kilómetros recorridos, el precio de la gasolina (por litro),
                    el dinero de gasolina gastado en el viaje y el tiempo que se ha tardado (en horas y minutos) y 
                    que calcule y muestre:
                                • Consumo de gasolina (en litros y dólares) por cada 100 km.
                                • Consumo de gasolina (en litros y dólares) por cada km.
                                • Velocidad media (en km/h y m/s).
            */
            case 4: Modulos.E8 e8 = new Modulos.E8();
                    e8.Variables();
                    break;
                    
             /*5)	Crear un programa que calcule el valor a pagar por un vehículo al circular por una pista.
                    El vehículo puede ser una bicicleta, una moto, un carro o un camión. 
                    El valor se calcula según los siguientes datos:
                            a.	Un valor  fijo de 0.50  centavos para las bicicletas.
                            b.	Las motos y los carros pagarán 0.30 centavos por km.
                            c.	Los camiones pagaran 0.50 centavos por km más 0.10 centavos por Tm (toneladas métricas).

Al final muestre el resultado solicitado.
*/
            case 5: Modulos.E10 e10 = new Modulos.E10();
                    e10.Datos();
                    break;    
                    /*
                    6)	A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a 1000,
                    por encima de 1000 y hasta 2000 el 5% del adicional, y por encima de 2000 el 3% del adicional. 
                    Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo.
                    */
            case 6: Modulos.E12 e12 = new Modulos.E12();
                    e12.Datos();
                    break;      
            /*
                    7)	Ingresar tres números y mostrar el menor o el mayor, según el usuario decida.*/
            case 7: Modulos.E14 e14 = new Modulos.E14();
                    e14.Datos();
                    break;     
            default:                 
                    System.out.println("Por favor ingrese un valor existente en el menu");
                    Menu();
                    break;
        }
     }     
    
    public boolean validarNumeros(String cadena) {
        if (cadena.matches("[0-9]*")) {
         return true;
        } else {
         return false;
        }
    }
    public static void main(String[] args) {        
        Menu();       
        Modulos.E2 e2 = new Modulos.E2();
        
    }
    
}
