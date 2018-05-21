package beginner;

/*
If Give an integer N . Write a program to obtain the sum of the first and last digit of this number.
Input
The first line contains an integer T, total number of test cases. Then follow T lines, each line contains an integer N.

Output
Display the sum of first and last digit of N.

Constraints
1 <= T <= 1000
1 <= N <= 1000000
Example
Input
3 
1234
124894
242323

Output
5
5
5
*/

import java.util.Scanner;

public class FirstLastDigit_FLOW004 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0)
		{
			int n = sc.nextInt();
			boolean flag = true;
			int sum = 0;
			while(n>0)
			{
				if(flag)
				{
					sum += n % 10;
					flag = false;
				}
				if(n/10==0)
				{
					sum += n;
				}
				n /= 10;
			}
			System.out.println(sum);
			
			
			/*int m = 0;
			int ld = n % 10;
			while(n > 0)
			{
				m = n % 10;
				n = n / 10;
			}
			System.out.println(m+ld);*/
		}
		sc.close();
	}

}
