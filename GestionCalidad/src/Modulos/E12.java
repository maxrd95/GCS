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
public class E12 {
    Scanner numero = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    
    public void Datos(){                
        double Sueldo;
        System.out.println("Ganancia neta de un trabajador dependiendo de su sueldo.");
        System.out.println("Ingrese el sueldo del trabajador: ");
        Sueldo = numero.nextDouble();
        Sueldo = metodo.Doble(String.valueOf(Sueldo));
        Mostrar(Sueldo);
    }
    public void Mostrar(double sueldo){
        double Descuento;
        if (sueldo <= 1000 ) {
            Descuento = sueldo * 0.10;
            sueldo = sueldo - Descuento;
             
        }else if(sueldo > 1000 || sueldo <= 2000){
            Descuento = (sueldo * 0.10) + (sueldo * 0.05);
            sueldo = sueldo - Descuento;
        }else{
            Descuento = (sueldo * 0.10) + (sueldo * 0.05) + (sueldo * 0.03);
            sueldo = sueldo - Descuento;
        }
        System.out.println("Su Descuento es de : " + Descuento + "\n" 
                + "Su sueldo neto es : " + sueldo);
        Menu();
    }
}
