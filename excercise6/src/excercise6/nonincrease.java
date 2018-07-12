package excercise6;

import java.util.Scanner;

public class nonincrease {
	public static void main(String[] arg)
	{ 
		int n;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter any number:");
	    n = s.nextInt();
	    
	    sort(n);
		 check(n);
	}
		 
	
	
	
public static void sort(int number)
{
	 int i=0,t;
	 int len = String.valueOf(number).length();
     int arr[] = new int[len];
     int temp = number;
     do {
         arr[i] = temp % 10;
         temp /= 10;
         i = i + 1;
     } while (temp != 0);
     for (int x = 0; x < len; x++) {
         for (int y = x + 1; y < len; y++) {
             if (arr[x] < arr[y]) {
                 t = arr[x];
                 arr[x] = arr[y];
                 arr[y] = t;
             }
         }
     }
     System.out.print("Sorted number in non-increasing order : ");
     for (int x = 0; x < len; x++) {
         System.out.print(arr[x]);
     }
	 }    
		


	public static void check(int m)
		 { 
		int sum=0,n1;
		 
		 while(m>0)
			 
		 {
		        n1 = m % 10;
		        if(n1%2==0)
		        {
		        sum = sum + n1;
		        }
		        m = m / 10;
		  }
		   System.out.println("");
		    System.out.println("sum of the even numbers="+sum);
		    if(sum>15)
		    {
		    
		    System.out.println("True");
		    }
		    
		    else
		    {
		    	System.out.println("False");
		    }
		    	
		 }  
}
			

