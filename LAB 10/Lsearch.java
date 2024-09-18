import java.util.*;

public class Lsearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no size of array");
		int n = sc.nextInt();
		int[] a;
		
		for (int i = 0;i<n;i++ ) 
		{
			System.out.println("Enter element at"+"a["+i+"]");
			 a[i]  = sc.nextInt();	
		}


		for (int i = 0;i<n;i++ ) 
		{
			System.out.println("Your element at"+"a["+i+"]"+"is" + a[i]);	
		}

		System.out.println("Enter element you want to find");

		int m = sc.nextInt();

		for (int i = 0;i<a.length ;i++ )
		{
			if (a[i] == m) 
			{
				System.out.println("your element is found at " + i);
				return;
			}
			else
			{
				System.out.println("ooppps!!! your element is not found");
			}
		}
	}

}