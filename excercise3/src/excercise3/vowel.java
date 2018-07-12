package excercise3;
import java.util.Scanner;
public class vowel {

	public static void main(String[] arg)
	{ 
		Scanner ss = new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String s = ss.nextLine(); 
		check(s);
		
	}
	
	public static void finalcheck(int k)
	{
		switch(k)
		{
		case 'a':
			System.out.print("vowel");
			break;
		case 'e':
			System.out.print("vowel");
			break;
		case 'i':
			System.out.print("vowel");
			break;
		case 'o':
			System.out.print("vowel");
			break;
		case 'u':
			System.out.print("vowel");
			break;
		case 'A':
			System.out.print("vowel");
			break;
		case 'E':
			System.out.print("vowel");
			break;
		case 'I':
			System.out.print("vowel");
			break;
		case 'O':
			System.out.print("vowel");
			break;
		case 'U':
			System.out.print("vowel");
			break;
			default:
				System.out.print("consonant");
		}
	}
	public static void check(String s1)
	{
		
		for(int i = 0; i < s1.length(); i++)
		{
		   char c = s1.charAt(i);
		   if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
		   {
			   finalcheck(c);
		   }
		   else
		   {
			   System.out.println("the input is not a letter");
		   }
		}
	}
	
	
	
	
	
}

