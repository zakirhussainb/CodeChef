package beginner;
import java.util.*;
public class PackagingCupCakes_MUFFINS3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0)
		{
			int n = sc.nextInt();
			int out = 0;
			switch(n)
			{
				case 0:
					out = 0;break;
				case 1:
					out = 1;break;
				case 2:
					out = 2;break;		
			}
			if(n > 2)
			{
				int rem1 = n % (n-1);
				int rem2 = n % (n-2);
				if(rem2>rem1)
					out = n - 2;
				else
					out = n - 1;
			}
			
			System.out.println(out);
		}

	}

}
