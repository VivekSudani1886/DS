import java.util.*;

public class Bsearch
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

		System.out.println("Enter element you want to find");
		int m = sc.nextInt();
		int left = 0;
		int right = n-1;

		Bs(a,left,right,m);
	}

	public   static void  Bs(int[] a,int left, int right,int m)
	{
		boolean flag = false;
			while(left<=right)
			{
				int mid =  (left+right)/2;
				if(a[mid] == m)
				{
					System.out.println("your element is at index"+(mid+1));
					flag = true;
					return;
				}
				else if(m<a[mid])
				{
					right = mid - 1;
				}
				else
				{
					left = mid + 1;
				}		
			}
			if(flag == false)
			{
				System.out.println("OOps!!! Your element is not found Boss");
			}
			
	}	
}