package excercise6;

import java.util.Scanner;

public class print {
public static void main(String[] args)
	
	{
	 
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any input1:");
   String  n1 = s.nextLine();
   System.out.print("Enter any input2:");
    int s1 = s.nextInt(); 
    int len= n1.length();
    int sub= len-s1;  
    for(int i=0;i<len;i++)
    {
    char k1=n1.charAt(i);
    System.out.print(k1);
        }
    for(int i=sub;i<len;i++)
    {
        for(int g=sub;g<len;g++)
        {char k2=n1.charAt(g);
        System.out.print(k2);
        }
    }
    
}
}
