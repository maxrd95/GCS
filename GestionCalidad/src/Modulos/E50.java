/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

/**
 *
 * @author Riden
 */
public class E50 {
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void mostrar(){
        int serie=0,n=1800,contador=2;
        String Serie="";
        System.out.println("-----------Ejercicio 50--------------------");
        System.out.println("La serie 2; 5; 7; 10; 12; 15; 17; : : : ; 1800");
        while(serie <= n){
            serie = serie + contador;
            if (contador==2) {
                contador=3;
            }else{
                contador=2;
            }
            Serie = Serie + " ; "+serie;
        }
        System.out.println(Serie);
    }
}
