package beginner;

import java.util.Scanner;

public class ReverseNumber_FLOW007 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int b=0;
		while(t --> 0)
		{
			int n = sc.nextInt();
			while(n>0)
			{
				b = n %10;
				n = n / 10;
				System.out.print(b);
				b=0;
			}		
		}
		sc.close();

	}

}
