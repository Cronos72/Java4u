import java.io.*;
import java.util.*;

public class Punktabstand
{
    public static void main(String argv[])throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int x1,y1,x2,y2;

        System.out.println("Punktabstand! Bitte geben sie ihre werte ein");
        
        System.out.println("P1x... ");
        x1 = scan.nextInt();
        System.out.println("P1y... ");
        y1 = scan.nextInt();
        System.out.println("P2x... ");
        x2 = scan.nextInt();
        System.out.println("P2y... ");
        y2 = scan.nextInt();

        System.out.println( Math.sqrt(  Math.pow( x2-x1, 2) + Math.pow(y2-y1, 2)  ));
    }
}