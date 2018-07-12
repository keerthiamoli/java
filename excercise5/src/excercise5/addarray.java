/*package excercise5;
import java.util.Scanner;

public class addarray {
	public static void main(String[] arg) {
		 int value, sum = 0;
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the number of values:");
	     value = s.nextInt();
	     int a[] = new int[value];
	    System.out.println("Enter the elements:");
	    for(int i = 0; i < value; i++)
	    {
	        a[i] = s.nextInt();
	        
	        	sum = sum + a[i];
	           
	        
	    }
	        
	        
	
	    System.out.println("Sum:"+sum);
	}
}
	    
	    

*/

package excercise5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class addarray {
	public static void main(String[] arg) {
		 int value, sum = 0;
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the number of values:");
	     value = s.nextInt();
	     
		   
	     try {
             int []a=new int[value];
             System.out.println("Enter the elements:");
             for(int i = 0; i < value; i++)
             {
                a[i] = s.nextInt();
               sum=sum+a[i];
             }
             System.out.println("Sum:"+sum);
       
      }  
         catch(Exception e) {
           
             System.out.println("invalid input");
         }
	}

}   
	     
	     