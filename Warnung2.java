public class Warnung2
{
    public static void main(String argv[] )
    {
        int wert = Integer.parseInt( argv[0] );
        int grenzWertUnten = Integer.parseInt( argv[1] );
        int grenzWertOben  = Integer.parseInt( argv[2] );

        if ( wert > grenzWertUnten && wert < grenzWertOben)
        {
            System.out.println("Grenzbereich ereicht");
        }
    }
}