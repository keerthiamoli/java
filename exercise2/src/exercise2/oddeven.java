package exercise2;
import java.util.Scanner;
public class oddeven {
	public static void main(String arg[])
	{
		int number;
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter any number:");
	    number = s.nextInt();
	    if((number>20)&&(number<30))
	    {
	    	if(number%2==0)
	    	{
	    		System.out.println("Tom");
	    		
	    	}
	    	else
	    	{
	    		System.out.println("Jerry");
	    		
	    	}
	    }
	    
	}

}
