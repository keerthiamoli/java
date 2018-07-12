package excercise6;
import java.util.Scanner;
public class display {
public static void main(String[] args)
	
	{
	Scanner ss = new Scanner(System.in);
    System.out.print("Enter the character: ");
    char c = ss.next().charAt(0);
    if(c>=97 && c<=123) 
    		{
    	System.out.println(" small case  ");
    		}
    else if(c>=65 && c<=96)
	   {
    	System.out.println(" UPPER CASE "); 
	   }
    else if(c>=48 && c<= 57)
	   {
 	System.out.println(" number "); 
	   }
    else
    {
    	System.out.println("  special character "); 
    }
	
	}

}
