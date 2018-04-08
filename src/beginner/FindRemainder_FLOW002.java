package beginner;

import java.util.Scanner;

public class FindRemainder_FLOW002 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0,b=0,rem=0;
		while(t --> 0)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			rem = a % b;
			System.out.println(rem);
		}
		sc.close();
	}

}
