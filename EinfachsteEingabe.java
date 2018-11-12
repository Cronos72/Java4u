import java.io.*;

public class EinfachsteEingabe
{
    public static void main( String arg[]) throws IOException
    {
        System.out.println("Geben sie ein zeichen ein");
        int zeichen = System.in.read();
        System.out.println(zeichen);
        System.out.println((char)zeichen);
    }
}