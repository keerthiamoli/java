package excercise6;
import java.util.Scanner;
public class guess {
public static void main(String[] args)
	
	{
	 int number,n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any limit:");
    number = s.nextInt();
    System.out.print("Enter any value:");
    n = s.nextInt();
    if(n<number)
    {
    	System.out.println("the entered value is less than original");
    }
    else if(n==number)
    {
    	System.out.println("the entered value is equal to original");
    }
    else
    {
    	System.out.println("the entered value is greater than original");
    }
}
}
