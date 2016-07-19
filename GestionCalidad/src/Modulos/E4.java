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
public class E4 {
    public static void E4(){
        Scanner numero = new Scanner(System.in);
        System.out.println("Área y el perímetro de un triángulo rectángulo");   
        int Base,Altura,Area,hipotenusa,Perimetro;
        System.out.println("Ingrese la Base del triángulo");
        Base = numero.nextInt();
        System.out.println("Ingrese la Altura del triángulo");
        Altura = numero.nextInt();        
        Area = (Base * Altura)/2;
        hipotenusa = (Base * Base) + (Altura * Altura);
        hipotenusa =  (int) Math.sqrt(hipotenusa);
        Perimetro = hipotenusa + Area + Altura;
        System.out.println("El área es: " + Area + "\n" +"El perimetro es: " + Perimetro);
        Menu();
     }
}
