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
        System.out.println("====================================================Menú=========================================================");
        System.out.println("===== 1.-  Cálcular Metros o Kilometros de Millas Marinas.                                                 ======");
        System.out.println("===== 2.-  Área y el perímetro de un triángulo rectángulo.                                                 ======");
        System.out.println("===== 3.-  Calcular días y horas en minutos.                                                               ======");
        System.out.println("===== 4.-  Consumo de conbustible.                                                                         ======");
        System.out.println("===== 5.-  Valor a pagar en la carretera dependiendo del vehiculo.                                         ======");
        System.out.println("===== 6.-  Ganancia neta de un trabajador dependiendo de su sueldo.                                        ======");
        System.out.println("===== 7.-  Ingresar 3 números y saber cual es el mayor o menor.                                            ======");
        System.out.println("===== 8.-  Par o Impar, Positivo o Negativo, Entero o Decimal.                                             ======");
        System.out.println("===== 9.-  Grados Centigrados a Fahrenheit o Viceversa.                                                    ======");
        System.out.println("===== 10.- Calculando dinero es Suficiente? o Insuficiente?                                                ======");
        System.out.println("===== 11.- Depreciación del vehiculo por año.                                                              ======");
        System.out.println("===== 12.- Realice un programa que liste la tabla de sumar entre el 0 y 9 de cualquier número ingresado.   ======");
        System.out.println("===== 13.- Suma y Media de un conjunto de números ingresados.                                              ======");
        System.out.println("===== 14.- Triángulo N filas.                                                                              ======");
        System.out.println("===== 15.- Calcular y Mostrar la suma de los números pares comprendidos entre 20 y N.                      ======");
        System.out.println("===== 16.- Múltiplos de 5 entre 1 y N.                                                                     ======");
        System.out.println("===== 17.- Ingreso de un valor entero e indique si dicho valor es primo o no.                              ======");
        System.out.println("===== 18.- Encuentre y Muestre la segunda cantidad mayor de las N cantidades positivas ingresadas          ======");
        System.out.println("===== 19.- Calcular la suma de los N primeros números naturales                                            ======");
        System.out.println("===== 20.- Mostrar el resultado de la siguiente fórmula:                                                   ======");
        System.out.println("=====       S = ( A - 1)^1 + ( A - 2)^2 + ( A - 3)^3 + ……( A - N)^N                                       ======");
        System.out.println("===== 21.- Mostrar el resultado de la siguiente fórmula:                                                   ======");
        System.out.println("=====       S =  1/2 +2/4  + 3/6 + ..........+ N/(N*2)                                                     ======");
        System.out.println("===== 22.- Mostrar el resultado de la siguiente fórmula:                                                   ======");
        System.out.println("=====       S =  1! +2! + 3! +  ...............+ N!                                                        ======");
        System.out.println("===== 23.- Número Perfecto de un solo valor ingresado                                                      ======");
        System.out.println("===== 24.- Calcular los 5 primeros números perfectos                                                       ======");
        System.out.println("===== 25.- Calcular la siguiente serie completa:                                                           ======");
        System.out.println("=====       2; 5; 7; 10; 12; 15; 17; : : : ; 1800                                                          ======");
        System.out.println("=================================================================================================================");     
        System.out.println("=====     Elige una opción del Menú:                                                                       ======");             
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
            /*
            8)	Realice un programa que muestre si un número ingresado es par o impar, positivo o negativo, entero o decimal.        
            */
            case 8: Modulos.E16 e16 = new Modulos.E16();
                    e16.Datos();
                    break;  
                    
            /*
            9)	Hacer un programa que pida una letra por teclado y luego un número (dos variables), si la letra digitada es C 
                    entonces significa que el número representa grados centígrados, así que lo convierte a grados Fahrenheit, 
                    si la letra digitada es F entonces significa que el número representa grados Fahrenheit, 
                    así que lo convierte a grados centígrados. Si digitó una letra distinta entonces saque un mensaje de error 
                    diciendo que solo puede digitar C o F.        
            */
             case 9: Modulos.E18 e18 = new Modulos.E18();
                    e18.Datos();
                    break; 
                    
            /*10)	Pida por teclado cuantos billetes de 100, 20, 10, 5 y 1 tiene la persona en el bolsillo. 
                    Ahora pida por teclado cuanto vale un artículo, el programa debe decir si tiene el dinero suficiente 
                    para comprarlo y cuanto sería el vuelto, si le hace falta debe salir un aviso diciendo: 
                    "te falta dinero" y debe decir cuanto le falta.*/
                    
            case 10: Modulos.E20 e20 = new Modulos.E20();
                    e20.Datos();
                    break;
            /*11)	Un señor adquiere un vehículo en un valor X, dicha persona desea saber la depreciación que sufrirá 
                    dicho vehículo en N años. Previo análisis desarrolle un diagrama que permita mostrar el año 
                    y la depreciación que sufre el vehículo en cada año. 
                    Para calcular la depreciación usará el método de la “suma de dígitos”*/
            case 11: Modulos.E22 e22 = new Modulos.E22();
                    e22.Datos();
                    break;
            /*12)	Realice un programa que liste la tabla de sumar entre el 0 y 9 de cualquier número ingresado.*/
            case 12: Modulos.E24 e24 = new Modulos.E24();
                    e24.Datos();
                    break;
            case 13: Modulos.E26 e26 = new Modulos.E26();
                    e26.Datos();
                    break;
            case 14: Modulos.E28 e28 = new Modulos.E28();
                    e28.Datos();
                    break;
            case 15: Modulos.E30 e30 = new Modulos.E30();
                    e30.Datos();
                    break;
            case 16: Modulos.E32 e32 = new Modulos.E32();
                    e32.Datos();
                    break;
            case 17: Modulos.E34 e34 = new Modulos.E34();
                    e34.Datos();
                    break;
            case 18: Modulos.E36 e36 = new Modulos.E36();
                    e36.Datos();
                    break;
            case 19: Modulos.E38 e38 = new Modulos.E38();
                    e38.Suma_Naturales();
                    break;
            case 20: Modulos.E40 e40 = new Modulos.E40();
                    e40.Datos();
                    break;
            case 21: Modulos.E42 e42 = new Modulos.E42();
                    e42.Datos();
                    break;
            case 22: Modulos.E44 e44 = new Modulos.E44();
                    e44.Datos();
                    break;
            case 23: Modulos.E46 e46 = new Modulos.E46();
                    e46.Datos();
                    break;
            case 24: Modulos.E48 e48 = new Modulos.E48();
                    e48.calculo();
                    break;
            
            default:                 
                    System.out.println("Por favor ingrese un valor existente en el menú");
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
