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
public class E8 {
    Metodo.Metodos metodo = new Metodo.Metodos();
    Scanner numero = new Scanner(System.in);
    int Horas,Minutos,VelocidadKMH,VelocidadMS;
    double litrosKM,DineroKM,litros100KM,Dinero100KM,HorasTotal,KMrecorrido,Gasolina,DineroGastado;
    String kmrecorrido,gasolina,dineroGastado,horas,minutos;
    
    public void Variables(){
     
        System.out.println("Consumo de conbustible.    ");
        System.out.println("Total de KM recorridos");
        kmrecorrido = numero.next();        
        KMrecorrido = metodo.Doble(kmrecorrido);
        KMrecorrido = metodo.NegativoD(KMrecorrido);
        System.out.println("Precio de la gasolina por litro");
        gasolina = numero.next();
        Gasolina=metodo.Doble(gasolina); 
        Gasolina = metodo.NegativoD(Gasolina);
        System.out.println("Dinero de la gasolina gastado en el viaje");
        dineroGastado = numero.next();
        DineroGastado=metodo.Doble(dineroGastado);
        DineroGastado = metodo.NegativoD(DineroGastado);
        System.out.println("Tiempo que se ha tardado (en horas y minutos)");
        System.out.println("Ingrese la/s hora/s transcurrida/s");
        horas = numero.next();
        Horas = metodo.Entero(horas);
        Horas = metodo.NegativoE(Horas);
        System.out.println("Ingrese el/los minuto/s transcurrido/s");
        minutos = numero.next();
        Minutos = metodo.Entero(minutos);
        Minutos = metodo.NegativoE(Minutos);
        Consumokm();        
    }
    public void Consumokm(){
        litrosKM = DineroGastado / Gasolina;//litros consumibles totales        
        litrosKM = litrosKM/KMrecorrido;//Litros por KM
        DineroKM = DineroGastado/KMrecorrido;//Dinero gastado por KM
        litrosKM = Math.rint(litrosKM * 10000)/10000;
        DineroKM = Math.rint(DineroKM * 100)/100;
        Consumo100KM(litrosKM,DineroKM);                
    }
    public void Consumo100KM(double LitrosKM, double DineroKM){
        litros100KM = LitrosKM * 100;//Litros por 100km
        Dinero100KM = DineroKM * 100;//Dinero por 100km
        VelocidadMedia();
    }
    public void VelocidadMedia(){
        HorasTotal = Horas + Minutos / 60; 
        VelocidadKMH = (int) (KMrecorrido/ HorasTotal);
        VelocidadMS = (int)((KMrecorrido * 1000) / (HorasTotal * 3600)); 
        mostrar();
    }
    public void mostrar(){
        
        System.out.println("1. Consumo de gasolina (en litros y dólares) por cada 100 km. \n " 
                + "Litros : " + litros100KM + " Dólares : " + Dinero100KM + 
                "\n 2. Consumo de gasolina (en litros y dólares) por cada km. \n " 
                + "Litros : " + litrosKM + " Dólares : " + DineroKM + "\n" +
                "3. Velocidad media (en km/h y m/s). \n" +
                "KM/H : " + VelocidadKMH + "  M/S : " + VelocidadMS);
        metodo.retorno();
    }
}
