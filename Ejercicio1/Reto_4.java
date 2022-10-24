package Ejercicio1;

import java.util.Scanner;

public class Reto_4 
{
    public static void main(String[] args) 
    {
        /*Solicitar el año de nacimiento y calcular y mostrar la edad del usuario */
        int Año;
        int Edad;

        try (Scanner lectura = new Scanner(System.in)) 
        {
            System.out.println("Ingrese el año de la persona:" );
            Año = lectura.nextInt();
        }

        Edad = 2022 - Año;
        System.out.println("El edad de la persona es:" + Edad);
    }
    
}
