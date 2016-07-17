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
public class E2 {
    Scanner numero = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    String cadena;
    double valor,totalM,totalKM;
    public void Millas_M(){
        System.out.println("------------------Ejercicio 2-----------------------------");
        System.out.println("Ingrese un valor en Millas Marinas");
        cadena =numero.next();
        //boolean retorno = metodo.Decimales(cadena); 
               
        
        valor = Double.parseDouble(cadena);
        totalM = valor * 1852 ;
        Millas_KM(totalM);
    }
    public void Millas_KM(double KM){                        
        totalKM = KM * 1000;
        mostrar();
    }
    public void mostrar(){
        System.out.println("Su valor en Metos es: " + totalM + "M\n" + "Su valor en Kilometros es: " + totalKM + "KM");
        Menu();
    }
}
