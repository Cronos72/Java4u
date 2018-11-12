import java.io.*;
import java.util.*;



public class ParalelleR
{
    public static void main(String argv[])
    {
        Scanner scan = new Scanner(System.in);
        double r1,r2;
        

        System.out.println("Wiederstandt berechnung in paralelle shaltkreis!");
        System.out.println("Geben sie wiederstand R1 ein");
        r1 = scan.nextDouble();
        System.out.println("Geben sie wiederstand R@ eins");
        r2 = scan.nextDouble();
        
        System.out.println("Wiederstand R1 in Ohm: "+r1);
        System.out.println("Wiederstand R2 in Ohm: "+r2);
      
    
        System.out.println("Der gesammtwiederstand :"+ ((r1*r2)/(r1+r2)) +" Ohm");

    }

}