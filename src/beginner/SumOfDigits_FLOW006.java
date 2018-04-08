package beginner;
import java.util.*;
public class SumOfDigits_FLOW006 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = 0,m=0,sum=0;
		while(t --> 0)
		{
			n = sc.nextInt();
			while(n>0)
			{
				m = n % 10;
				sum = sum + m;
				n = n / 10;
			}
			System.out.println(sum);
			sum=0;m=0;n=0;
		}
		sc.close();
	}

}
