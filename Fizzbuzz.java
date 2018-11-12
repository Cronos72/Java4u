import java.lang.String;


public class Fizzbuzz
{
    public static void main(String argv[])
    {
        String[] output = new String[100];
        String tmp;
        for (int i = 1; i < 100; ++i) 
        {
            
            if (i % 3 == 0)
                output[i] += "Fizz";
            if(i % 5 == 0)
                output[i] += "Buzz";
            
                
            System.out.println(output[i]);
        }
        
        

        
     
       
	
    }
} 