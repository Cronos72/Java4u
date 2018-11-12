public class Warnung1
{
    public static void main(String argv[])
    {
        int grenzWert = 50;
        int wert = Integer.parseInt( argv[0] ); // solte eingelesen werden
        if (wert > grenzWert) System.out.println("Warnung");
    }
}