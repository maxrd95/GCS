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
            case 1: Modulos.E2 e2 = new Modulos.E2();
                    e2.Millas_M();
                    break;
            case 2: Modulos.E4 e4 = new Modulos.E4();
                    e4.E4();
                    break;
            case 3: Modulos.E6 e6 = new Modulos.E6();
                    e6.E6();
                    break;
            case 4: Modulos.E8 e8 = new Modulos.E8();
                    e8.Variables();
                    break;
            case 5: Modulos.E10 e10 = new Modulos.E10();
                    e10.Datos();
                    break;                
            case 6: Modulos.E12 e12 = new Modulos.E12();
                    e12.Datos();
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
