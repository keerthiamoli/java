package excercise6;
import java.util.Scanner;
public class reverse {

	public static void main(String args[])
	   {
	      String word, reverse ="";
	      Scanner n = new Scanner(System.in);
	 
	      System.out.println("Enter a string ");
	      word = n.nextLine();
	 
	      int length = word.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + word.charAt(i);
	 
	      System.out.println("Reverse string is: "+reverse);
	   }
}
