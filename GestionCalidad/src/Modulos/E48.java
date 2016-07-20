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
    Metodo.Metodos metodo = new Metodo.Metodos();
    public void calculo(){        
        System.out.println("-------------------ejercicio 48-------------------");
        int i, j, suma;
        System.out.println("Primeros  5 Números perfectos : ");
        for(i=1;i<=10000;i++){    // i es el número que vamos a comprobar
            suma=0;
            for(j=1;j<i;j++){  // j son los divisores. Se divide desde 1 hasta i-1 
                 if(i%j==0){
                    suma=suma+j;     // si es divisor se suma
                 }
            }
          if(i==suma){           // si el numero es igual a la suma de sus divisores es perfecto
                 System.out.println(i);
                 
              }
          
        }
        metodo.retorno();
    }
}
