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
public class E48 {
    public void calculo(){
        int suma=0,contador = 1,valor=0,contador2 = 0,ban=0;
        System.out.println("-------------------ejercicio 48-------------------");
        while(ban==0){
            valor=valor + 1;
            while(contador < valor){
                if (valor%contador==0) {
                    suma = suma + contador;                 
                }
                contador++;
            }
            if (suma==valor) {
                System.out.println(suma);
                contador2++;
            }
            if (contador2==5) {
                ban=1;
            }
        }
    }
}
