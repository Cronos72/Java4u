import java.io.*;
import java.util.Scanner;

import java.util.*;

public class Vergleich
{
    public static void main(String argv[] )
    {
        System.out.println("Vergleich");
        System.out.println("Bitte geben sie zahl eins ein");
        int zahl1 = new Scanner(System.in).nextInt();
        int zahl2 = new Scanner(System.in).nextInt();

        if (zahl1 > zahl2)
            System.out.println(zahl1);
        
        if (zahl2 > zahl1)
        System.out.println(zahl2);


    }
}