import java.io.*;
import java.util.*;
public class BenzinV2
{
    public static void main(String argv[]) throws IOException
    {
        double vebrauch, strecke;
        System.out.println("Berechnungs des durchscnittsvebrauch");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben sie den vebrauchten kraft stoff in litern ein:");
        vebrauch = scan.nextDouble();
        System.out.println("Bitte geben sie die laenge der gefahrenden strecke ein");
        strecke = scan.nextDouble();
        
       if(strecke != 0 ) 
            System.out.println("Durchscnitts vebrauch: " + (vebrauch / strecke) * 100 );
        
        System.out.println("Programm ende");
    }
}