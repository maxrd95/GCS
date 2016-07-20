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
        while(cadena.length() > 9){
            System.out.println("Igrese valores que no sobrepasen el limite de la variable, máximo 9 dígitos");
            cadena =numero.next();
            
        }                                
        
        return cadena;
    }
    
    public String SoN (String valor){
        while(!("s".equals(valor)) && !("n").equals(valor)){
            System.out.println("Solo puede ingresar s para continuar o n para salir");
            valor = numero.next();
        }
        return valor;
    }
    
    public int Entero(String valor){
        int valorD=0,ban=0;
        do{            
            try{ 
                   ban=0;
                   valorD = Integer.parseInt(valor);
                   max(valor);
            } catch(NumberFormatException nfe) { 
            System.out.println("No es de tipo entero");
            valor = numero.next();
            ban=1;
            }
        }while(ban==1);
        return valorD;
    }
    
    public double Doble(String valor){
        double ValorD=0.0;
        int ban = 0;
        do{
            
            try{ 
                   ban=0;
                   ValorD = Double.parseDouble(valor); 
            } catch(NumberFormatException nfe) { 
            System.out.println("No es un número ");
            valor = numero.next();
            ban=1;
            }
        }while(ban==1);
        return ValorD;
    }
    public void retorno(){
        String Salida;
        System.out.println("Presione s para continuar en el menú principal y n para salir");
        Salida = numero.next();
        Salida = SoN(Salida);
        if ("s".equals(Salida) || "S".equals(Salida)) {
            Menu();
        }
    }
    public int NegativoE(int valor){
        String Valor;
        while (valor < 0) {
            System.out.println("Ingrese un valor positivo");
            Valor = numero.next();
            valor = Entero(Valor);
        }
        return valor;
    }
    public double NegativoD(double valor){
        String Valor;
        while (valor < 0) {
            System.out.println("Ingrese un valor positivo");
            Valor = numero.next();
            valor = Doble(Valor);
        }
        return valor;
    }
}
