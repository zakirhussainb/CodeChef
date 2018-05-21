package beginner;
import java.util.*;
public class SecondLargest_FLOW017 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			int max = 0;int secMax = 0;
			if(A>B)
				max = A;
			else
				max = B;
			
			if(max < C) 
			{
				secMax = max;
				max = C;
			}
			else
			{
				secMax = B;
			}
			System.out.println(secMax);
		}
		sc.close();
	}

}
