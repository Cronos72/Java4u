public class Variablendekleration
{
    public static void main(String argv[])
    {
       
        double dblZahl1, dblZahl2;  //dekleration von variablen
        char buchStabe; //Zeichen
        long lngZahl;   //lange ganzzahl
        float fltZahl;  //float zahl
        
        /* Variablenname = Ausdruck */
        dblZahl1 = 1.2345; // zuweissung vom wert 1.2345 der variable namens dblZahl1
        dblZahl2 = dblZahl1 *5+7; // dblZahl2 wert wird aus der formel berechnet

        buchStabe = 'z'; //speichert das zeichen Z

        /* Konstante funktioneirn uqasi wie variablen, nur mann darfs sie waerend dem program verlaufs nicht veraendern, Zusaetzlich werden sie in grossbuchstaben deklariert und mit dem key word finale beschrifted*/
        final double PI = 3.145;

        //PI = 2; //will throw error
    } // ende of main methood
}//ende class