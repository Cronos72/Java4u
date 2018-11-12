import java.io.*;
import java.util.*;

public class Bestell
{
    public static void main (String argv[]) throws IOException
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Bitte geben sie ihren bestell wert ein");

        double bestellWert = scan.nextDouble();
        double versandpauschale = 5.50;
        double rechnungsBetrag = bestellWert;
        if (bestellWert < 200.00)
        {
            rechnungsBetrag += versandpauschale;
        }
        System.out.println("Bestellwert: "+ bestellWert);
        System.out.println("RechnungsBetrag: "+ rechnungsBetrag);
        System.out.println("Programmende Bestell");
    }
}