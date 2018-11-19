import java.io.*;
import java.util.*;

public class KinderG
{
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        double einkommen;
        int anzahlKinder;
        double kindergelt = 0.00;

         
        System.out.println("Kindergeltberechnung");
        System.out.println("Bitte geben sie ihr einkommen ein");
        einkommen = scan.nextDouble();
        System.out.println("Bitte geben sie die anzahl Kinder ann");
        anzahlKinder = scan.nextInt();

        if (einkommen < 45000)
        {
            if (anzahlKinder >= 1)
            {
                kindergelt += 70.00;
            }
            if (anzahlKinder >= 2)
            {
                kindergelt += 130.00;
            }
            if (anzahlKinder >= 3)
            {
                kindergelt += 220.00;
            }
            if (anzahlKinder >= 4)
            {
                kindergelt += 240.00;
            }
        }

        if (einkommen >= 45000)
        {
            if (anzahlKinder >= 1)
            {
                kindergelt += 70.00;
            }
            if (anzahlKinder >= 2)
            {
                kindergelt += 70.00;
            }
            if (anzahlKinder >= 3)
            {
                kindergelt += 140.00;
            }
            if (anzahlKinder >= 4)
            {
                kindergelt += 140.00;
            }
        }
        System.out.println("Ihr jahres einkommen in DS: "+ einkommen);
        System.out.println("Anzahl der kinder : "+ anzahlKinder);
        System.out.println("Ergebnis: "+ kindergelt +" D$ Kindergelt");
        System.out.println("Programende");


        
        
    }
}