import java.io.*;
import java.util.*;

public class Geraden
{
    public static void main(String[] args) throws IOException
    {
        boolean parralelle = false; 
        double ax, ay; // first point that make up line A
        double bx, by; // second point that make up line A

        double cx, cy; // first point that make up line B
        double dx, dy; // second point that make up line B

        Scanner scan = new Scanner(System.in);

        System.out.println("Schnittpunk Zweier geraden");
        
        
        /* Line One */
        System.out.println("eingabe ax: "); //Point 1
        ax = scan.nextDouble();
        System.out.println("eingabe ay: ");
        ay = scan.nextDouble();
        
        System.out.println("eingabe bx: "); //Point 2
        bx = scan.nextDouble();
        System.out.println("eingabe by: ");
        by = scan.nextDouble();

        /* LINE 2*/
        System.out.println("eingabe cx: "); //Point 1
        cx = scan.nextDouble();
        System.out.println("eingabe cy: ");
        cy = scan.nextDouble();
        
        System.out.println("eingabe dx: "); //Point 2
        dx = scan.nextDouble();
        System.out.println("eingabe dy: ");
        dy = scan.nextDouble();

        if ( ((by-ay)*(dx-cx) - (dy-cy)*(bx-ax) ) == 0 )
        {
            parralelle = true;
        }

        if (!parralelle)
        {
                
        }
        




        


        
    }
}