import java.io.*;
import java.util.*;

public class Benzin
{
    public static void main(String argv[])throws IOException
    {
        
        double liter, strecke;
        Scanner input = new Scanner(System.in);
        System.out.println("Berechnung des durchsnitt vebrauchs");
        
        System.out.println("Verbrauchter kraftstoff in liter: ");
        liter = input.nextDouble();

        System.out.println("Gefahrende strecke in KM");
        strecke = input.nextDouble();
        
        System.out.println("Der durchschnitssverbrauch ist:"+ (liter/strecke)*100 +" 1/199km");


    }
}