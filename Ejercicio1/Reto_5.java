package Ejercicio1;

import java.util.Scanner;

public class Reto_5 
{
    public static void main(String[] args) 
    {
        /*Programa que permita saber quien es mas alto*/
        try (Scanner lectura = new Scanner(System.in)) 
        {
            int David;
            int Luis;
            int Juan;

            System.out.println("Ingrese la altura de Juan: ");
            Juan = lectura.nextInt();
            System.out.println("Ingrese la altura de David: ");
            David = lectura.nextInt();
            System.out.println("Ingrese la altura de Luis: ");
            Luis = lectura.nextInt();

            if(Juan > David && Juan > Luis) 
            {
                System.out.println("Juan es el mal alto");
            }
            else if(David > Juan && David > Luis)
            {
                System.out.println("David es el mal alto");
            }
            else 
            {
                System.out.println("Luis es el mal alto");
            }
        }
    }
}
