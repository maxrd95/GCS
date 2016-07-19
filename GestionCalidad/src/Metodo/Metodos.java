/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo;

import static debergcs.DeberGCS.Menu;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class Metodos {
    Scanner numero = new Scanner(System.in);
    public String max(String cadena){        
        a:if (cadena.length()== 9){
                System.out.println("Igrese valores que no sobrepasen el limite de la variable, máximo 9 dígitos");
                cadena =numero.next();
                break a;             
            }
        return cadena;
    }
    public String Enteros(String cadena){                
        if (!cadena.matches("[0-9]*")) {           
            System.out.println("Solo se pueden ingresar valores numéricos");
            return "t";
        }       
        return "a";
    }
    public String ValorEntero(String retorno,String cadena1){ 
        if (cadena1.matches("[0-9]*")) {           
            return cadena1;
        }     
        Enteros(cadena1);                
        while(retorno == "t"){                        
            cadena1 = numero.next();                    
            retorno = Enteros(cadena1);            
        }        
        return cadena1;
    }    
    
    public double Doble(String valor){
        double ValorD=0.0;
        int ban = 0;
        do{
            
            try{ 
                   ban=0;
                   ValorD = Double.parseDouble(valor); 
            } catch(NumberFormatException nfe) { 
            System.out.println("No es de tipo double");
            valor = numero.next();
            ban=1;
            }
        }while(ban==1);
        return ValorD;
    }
}
