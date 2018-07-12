package exercise1;
import java.util.Scanner;
public class even {
	public static void main(String[] args)
	
	{
	 long number,n, m, a = 0,x,sum=0,m1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any number:");
    number = s.nextLong();
    m = number;
    while(number > 0)
    {
        x = number % 10;
        a = a * 10 + x;
        number = number / 10;
    }
    if(a == m)
    {
    {   m1=a;
        while(m1>0)
        {
        n = m1 % 10;
        if(n%2==0)
        {
        sum = sum + n;
        }
        m1 = m1 / 10;
    }
    }
    
    if(sum>25)
    {
    
    System.out.println(+m +"is palindrome and the sum of even numbers is greater than 25");
    }
    
    else
    {
    	System.out.println(+m +"is palindrome and the sum of even numbers is less than 25");
    }
    	
    }
	
    else
    {
    	System.out.println(+m +"is not a palindrome");
    }

}
}
