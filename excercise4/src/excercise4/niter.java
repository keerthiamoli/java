package excercise4;
import java.util.Scanner;
public class niter {
	

public static void main(String[] args)
	
	{
	Scanner s = new Scanner(System.in);
    System.out.print("Enter any number:");
    int value = s.nextInt();
	
	for(int i=1;i<=value;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print(+i);
		}
		System.out.println(" ");
	}

}
}
