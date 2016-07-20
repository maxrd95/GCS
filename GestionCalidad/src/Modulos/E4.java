/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import static debergcs.DeberGCS.Menu;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Riden
 */
public class E4 {
     Metodo.Metodos metodo = new Metodo.Metodos();
     Scanner numero = new Scanner(System.in);
     DecimalFormat decimales = new DecimalFormat("0.0000"); //Nos permite mostrar por pantalla numeros con el formato dado
    public void E4(){        
        System.out.println("Área y el perímetro de un triángulo rectángulo");   
        double Base,Altura;
        double Area,hipotenusa,Perimetro;
        String base,altura;
        System.out.println("Ingrese la Base del triángulo");  
        base = numero.next();
        Base = metodo.Doble(base);
        Base = metodo.NegativoD(Base);
        System.out.println("Ingrese la Altura del triángulo");
        altura = numero.next();
        Altura = metodo.Doble(altura);     
        Altura = metodo.NegativoD(Altura);
        Area = (Base * Altura)/2;
        hipotenusa = (Base * Base) + (Altura * Altura);
        hipotenusa =  Math.sqrt(hipotenusa);
        Perimetro = hipotenusa + Base + Altura;
        System.out.println("El área es: " + decimales.format(Area) + "\n" +"El perimetro es: " + decimales.format(Perimetro));
        metodo.retorno();
     }
}
