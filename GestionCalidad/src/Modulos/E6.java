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
    public static void E6(){
        Scanner numero = new Scanner(System.in);
        int Dia = 0,Hora=0,Minuto=0;
        System.out.println("Ingrese los minutos que desea calcular en Dia:Horas:Minutos");
        Minuto = numero.nextInt();
        if(Minuto >= 1440){
            Dia = Minuto/1440;
            Minuto = Minuto - (Dia * 1440);
        }
        if(Minuto >= 60){
            Hora = Minuto/60;
            Minuto = Minuto - (Hora * 60);
        }
        System.out.println("Dias: " + Dia + " Horas : " + Hora + " Minutos : " + Minuto );
        Menu();
    }
}
