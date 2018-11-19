import java.io.*;
import java.util.*;
public class Wiederstand
{
    public static void main(String argv[]) throws IOException
    {
       Scanner scan = new Scanner(System.in);
       String eingabe = "";
       double r1,r2, gesamtwiederstand;

       System.out.println("Wiederstands Berechning");
       System.out.println("(P)aralelle = oder (R)eihen schalting"); 
       eingabe = scan.next();
       System.out.println("eingabe: "+eingabe);

       System.out.println("Bitte geben sie einen wert fuer R1 ein: ");
       r1 = scan.nextDouble();

       System.out.println("Bitte geben sie einen wert fuer R2 ein: ");
       r2 = scan.nextDouble();

       System.out.println("R1 in Ohm: "+ r1);
       System.out.println("R2 in Ohm: "+ r2);
       
       if (eingabe.equals("p"))
       {
            gesamtwiederstand = (r1*r2)/(r1+r2);
            System.out.println("Dergesamt wiederstand der paralleshaltung ist "+ gesamtwiederstand);
       }
       if (eingabe.equals("r"))
       {
           gesamtwiederstand = r1+r2;
           System.out.println("Dergesamt wiederstand der rehenschaltung ist "+ gesamtwiederstand);
       }
       
        
    }
}