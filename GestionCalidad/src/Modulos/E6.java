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
public class E6 {
    Scanner numero = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void E6(){        
        int Dia = 0,Hora=0,Minuto=0;
        String minuto;
        System.out.println("--------------Ejercicio 6----------------------");
        System.out.println("Calcular días y horas en minutos");        
        System.out.println("Ingrese los minutos que desea calcular en Días, Horas y Minutos");
        minuto = numero.next();
        minuto = metodo.max(minuto);
        Minuto = metodo.Entero(minuto);
        Minuto = metodo.NegativoE(Minuto);
        if(Minuto >= 1440){
            Dia = Minuto/1440;
            Minuto = Minuto - (Dia * 1440);
        }
        if(Minuto >= 60){
            Hora = Minuto/60;
            Minuto = Minuto - (Hora * 60);
        }
        System.out.println("Dias: " + Dia + " Horas : " + Hora + " Minutos : " + Minuto );
        metodo.retorno();
    }
}
