package Ejercicio1;

import java.util.Scanner;

public class Reto_3 
{
    /*Calcular el perimetro de un rectangulo sabiendo que el lado mayor es el doble del lado menor solicitar datos */
    public static void main(String[] args) 
    {
        double lado;
        double ladomayor;
        double perimetro;
        
        try (Scanner lectura = new Scanner(System.in)) 
        {
            System.out.println("Ingrese el lado menor");
            lado = lectura.nextDouble();
        } 

        ladomayor = lado + lado;

        perimetro = (lado * 2)+(ladomayor * 2);

        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
}
