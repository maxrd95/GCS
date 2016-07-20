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
/*
8)	Realice un programa que muestre si un número ingresado es par o impar, positivo o negativo, entero o decimal.
*/
public class E16 {
    Scanner ValorPedido = new Scanner(System.in);
    Metodo.Metodos metodo = new Metodo.Metodos();
    
    public void Datos(){
        String Numero;
        System.out.println("Par o Impar, Entero o Decimal, Positivo o Negativo");
        System.out.println("Ingrese el número que desea evaluar: ");
        Numero = ValorPedido.next();
        validacion(Numero);
    }
    public void validacion(String Numero){
        double Valor;
        Valor = metodo.Doble(Numero);
        if(Valor%1==0){
            System.out.println("Entero");
        }else{
            System.out.println("Decimal");
        }        
        
        if (Valor < 0) {
            System.out.println("Negativo");
        }else{
            System.out.println("Positivo");
        }
        if (Valor%2==0) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        metodo.retorno();
    }
}
