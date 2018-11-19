import java.io.*;
import java.util.*;



public class Kehrwert
{
    public static void main(String arv[]) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben sie eine zahl ein");
        double zahl = new Scanner(System.in).nextDouble();

        if ( zahl != 0)
        {
            System.out.println("kehrwert :"+  ( 1/zahl ) );
        }
        

        
    }
}