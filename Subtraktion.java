import java.io.*;
import java.util.*;

public class Rechnen
{
    public static void main(String argv[])throws IOException 
    {
        
        double zahl1,zahl2;

        Scanner input = new Scanner(System.in);

        System.out.println("Input Minuend");
        zahl1 = input.nextDouble();

        System.out.println("Subtrahend");
        zahl2 = input.nextDouble();
        
        System.out.println(zahl1 + " + "+zahl2+" "+ plus(zahl1,zahl2) );
        
    }
    public static double plus(double a, double b)
    {
        return a+b;
    }
}