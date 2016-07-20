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
public class E8 {
    Metodo.Metodos metodo = new Metodo.Metodos();
    Scanner numero = new Scanner(System.in);
    int Horas,Minutos=61,VelocidadKMH,VelocidadMS;
    double litrosKM,DineroKM,litros100KM,Dinero100KM,HorasTotal,KMrecorrido,Gasolina=0,DineroGastado;
    String kmrecorrido,gasolina,dineroGastado,horas,minutos;
    DecimalFormat decimales = new DecimalFormat("0.000");
    public void Variables(){
     
        System.out.println("Consumo de conbustible.    ");
        System.out.println("Total de KM recorridos");
        kmrecorrido = numero.next();        
        KMrecorrido = metodo.Doble(kmrecorrido);
        KMrecorrido = metodo.NegativoD(KMrecorrido);
        System.out.println("Precio de la gasolina por litro");        
        while(Gasolina < 0.1 || Gasolina >100){
            gasolina = numero.next();
            Gasolina=metodo.Doble(gasolina); 
            Gasolina = metodo.NegativoD(Gasolina);
            if (Gasolina < 0.1 || Gasolina >100) {
                System.out.println("Ingrese un precio real para la gasolina");
            }
        }
        System.out.println("Dinero de la gasolina gastado en el viaje");
        while(DineroGastado < Gasolina){
            dineroGastado = numero.next();
            DineroGastado=metodo.Doble(dineroGastado);
            DineroGastado = metodo.NegativoD(DineroGastado);
            if (DineroGastado < Gasolina) {
                System.out.println("El dinero gastado debe ser mayor al precio de la gasolina");
            }
        }
        
        System.out.println("Tiempo que se ha tardado (en horas y minutos)");
        System.out.println("Ingrese la/s hora/s transcurrida/s");
        horas = numero.next();
        horas = metodo.max(horas);
        Horas = metodo.Entero(horas);
        Horas = metodo.NegativoE(Horas);
        System.out.println("Ingrese el/los minuto/s transcurrido/s");
        while(Minutos > 60){
            minutos = numero.next();
            Minutos = metodo.Entero(minutos);
            Minutos = metodo.NegativoE(Minutos);
            if (Minutos > 60) {
                System.out.println("Los minutos no pueden ser superiores a 60");
            }
        }
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
                + "Litros : " + decimales.format(litros100KM) + " Dólares : " + decimales.format(Dinero100KM) + 
                "\n 2. Consumo de gasolina (en litros y dólares) por cada km. \n " 
                + "Litros : " + decimales.format(litrosKM) + " Dólares : " + decimales.format(DineroKM) + "\n" +
                "3. Velocidad media (en km/h y m/s). \n" +
                "KM/H : " + decimales.format(VelocidadKMH) + "  M/S : " + decimales.format(VelocidadMS));
        metodo.retorno();
    }
}
