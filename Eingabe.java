import java.io.*;
import java.util.Scanner;

public class Eingabe
{
    public static void main(String argv[]) throws IOException
    {
        /* The buffered reader can read anything, strings, bytes etc */
        String str;
        BufferedReader input = new BufferedReader(new InputStreamReader( System.in));
        System.out.println("Bitte geben sie ihren vornamen ein:");
        str = input.readLine();
        System.out.println("Ihr name ist "+ str);
        /** but reading key board input is much easier with the scanner class from java 1.6 */
        System.out.println("Bitte geben sie ihren nach namen ein");
        Scanner input2 = new Scanner(System.in);
        str = input2.nextLine(); // there is also a methood nextInt()
        System.out.println("Ihr nach name ist "+ str);



    }
}