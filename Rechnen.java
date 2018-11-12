import java.io.*;
import java.util.*;

public class Rechnen
{
    public static void main(String argv[])throws IOException 
    {
        /*Seite 20 aufgabe 1-3*/ 
        double zahl1,zahl2;

        Scanner input = new Scanner(System.in);

        System.out.println("Input number one");
        zahl1 = input.nextDouble();

        System.out.println("Input number two");
        zahl2 = input.nextDouble();
        
        System.out.println(zahl1 + " + "+zahl2+" = "+ plus(zahl1,zahl2) );
        System.out.println(zahl1 + "- "+zahl2+" = "+ minus(zahl1,zahl2) );
        System.out.println(zahl1 + "/ "+zahl2+" = "+ dividieren(zahl1,zahl2) );
        
    }
    public static double plus(double a, double b)
    {
        return a+b;
    }
    public static double minus(double a, double b)
    {
        return a-b;
    }
    public static double dividieren(double a, double b)
    {
        return a / b ;
    }
}