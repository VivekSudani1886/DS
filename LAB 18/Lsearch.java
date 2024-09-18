import java.util.*;

public class Lsearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0;i<n;i++ ) 
		{
			System.out.println("Enter element at "+"a["+(i+1)+"]");
			 a[i]  = sc.nextInt();	
		}


		for (int i = 0;i<n;i++ ) 
		{
			System.out.println("Your element at "+" "+"a["+(i+1)+"] "+"is " + a[i]);	
		}

		System.out.println("Enter element you want to find ");

		int m = sc.nextInt();
		 boolean flag = false;
		for (int i = 0;i<a.length ;i++ )
		{
			if (a[i] == m) 
			{
				System.out.println("your element is found at " + (i+1));
				System.out.println(" ");
				flag = true;
				return;
			}
		}
		
		if(flag == false)
		{
				System.out.println("ooppps!!! your element is not found ");
		}
	}

}