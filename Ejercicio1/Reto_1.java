package Ejercicio1;

import java.util.Scanner;

public class Reto_1 
{
    /*Crea un programa en java que convierta grados Fahrenheit (°F) a Centígrados (°C)*/
    public static void main(String[] args) 
    throws Exception 
    {
        try (Scanner leer = new Scanner (System.in)) 
        {
            System.out.println("Ingrese el numero de grados (°F):");
            int fahrenheit = leer.nextInt();
            int centigrados =(int) ((fahrenheit - 32)/1.8); 
            System.out.println("Se debe precalentar a: "+"°C"+centigrados);
        }
    }
}
