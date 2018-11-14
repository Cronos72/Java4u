public class Dreieck
{
    public static void main(String[] args) 
    {
        System.out.println("Pruefen der konstrukturierbarkeit eines dreiecks");

        double a,b,c;
        a = Double.parseDouble( args[0] ); 
        b = Double.parseDouble( args[1] ); 
        c = Double.parseDouble( args[2] ); 

        System.out.println("Seite A : " + a);
        System.out.println("Seite B : " + b);
        System.out.println("Seite C : " + c);

        if ( a+b > c &&  a + c > b && b + c > a)
        {
            System.out.println("Das dreieck ist konstruierbar");
        }
        System.out.println("Programmende");
    }
}