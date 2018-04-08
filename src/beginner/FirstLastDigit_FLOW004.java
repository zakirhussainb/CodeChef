package beginner;
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
		}
		sc.close();
	}

}
