package beginner;

import java.util.Scanner;

public class ReverseNumber_FLOW007 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int b=0;int rev = 0;
		while(t --> 0)
		{
			int n = sc.nextInt();
			while(n>0)
			{
				rev = (rev * 10) + (n % 10); 
			    n = n / 10;
			}
			System.out.println(rev);
		}
		sc.close();

	}

}
