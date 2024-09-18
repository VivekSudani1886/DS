import java.util.*;

public class BsearchR
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

		if(Bs(a,left,right,m)==-1){
			System.out.println("Your NO is not found BOOS!!!! ");
		}

	}

	public   static int  Bs(int[] a,int left, int right,int m){		
		if(left>=right) return -1;
		int mid =  (left+right)/2;

		if(a[mid] == m){
			System.out.println("your element is at index  "+(mid+1));
			return mid;
		}else if(m<a[mid]){
			return Bs(a,left,mid - 1,m);
		}else{
			return Bs(a,mid + 1,right,m);		 
		}						
	}	
}


//6#4N2$