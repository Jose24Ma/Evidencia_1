package Ejercicio1;

import java.util.Scanner;
import java.util.Random;

public class Reto_6 
{
    public static void main(String[] args) 
    {
        /*Generar 3 numeros al azar y sumarlos con un datos ingresado*/  
        try (Scanner lectura = new Scanner(System.in)) 
        {
            int numeros = 0;
            int sumarnd = 0;
            int total;
            int num1;

            Random rnd = new Random();

            for(int i=1;i<=3;i++)
            {
                numeros = rnd.nextInt(10)+1;
                System.out.println(numeros);
                sumarnd = sumarnd + numeros;
            }
            System.out.println("Ingrese un numero: ");
            num1 = lectura.nextInt();
            total = sumarnd + num1;
            System.out.println("El resultado de la suma es: "+total);

        }
    }
    
}
