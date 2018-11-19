import java.io.*;
import java.util.*;



public class Zahlinfo
{
    public static void main(String argv[])
    {
        System.out.println("Zahl Information");
        System.out.println("bitte geben sie eine zahl ein");
        int zahl = new Scanner(System.in).nextInt();

        if (zahl < 0 )
            System.out.println("zahl ist negative");
        if (zahl > 0)
            System.out.println("zahl ist positive");

        if (zahl == 0)
        {
            System.out.println("zahl ist 0 ");
        }

        if (zahl % 2 == 0)
            System.out.println("Zahl ist gerade");
        if (zahl % 2 != 0)
            System.out.println("zahlh ist ungerade");

    

        
    }
}