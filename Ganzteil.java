import java.io.*;
import java.util.*;



public class Ganzteil
{
    public static void main(String argv[]) throws IOException
    {
        int zahl1, zahl2;
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben sie eine  ein");
        zahl1 = scan.nextInt();
        System.out.println("Geben sie eine zweite  ein");
        zahl2 = scan.nextInt();

        System.out.println(zahl1 +" / "+ zahl2 +" = "+ (zahl1 / zahl2) +" Rest:"+ (zahl1 % zahl2)) ;


    }
}