import java.io.*;
import java.util.*;
public class Bestell2
{
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        double auftragssumme, rechnungsBetrag, pauschalle;
        auftragssumme = 0;
        rechnungsBetrag = 0;
        pauschalle = 5.50;
        rechnungsBetrag += auftragssumme + pauschalle;
        System.out.println("Berechnung des rechnungs betrag");

        System.out.println("Bitte geben sie ihren rechnungs betrag ein");
        auftragssumme = scan.nextDouble();

        if( auftragssumme > 100.00 && auftragssumme < 200.00)
        {
            rechnungsBetrag = auftragssumme + (pauschalle -2.50);
        }
        if (auftragssumme > 200.00)
        {
            rechnungsBetrag -= pauschalle;
        }

        System.out.println("Auftragssumme: "+ auftragssumme);
        System.out.println("rechnungsbetrag: "+ rechnungsBetrag);
        

        
    }
}