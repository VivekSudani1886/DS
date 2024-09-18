import java.util.*;

public class Ishort 
{
	public static void iShort(int a[],int n)
	{
		int i = 0;
		int j;
		int key;

		while(i<n)
		{
			key = a[i];
			j= i - 1;

			while( j >= 0 && a[j]>key )
			{
				a[j+1] = a[j];
				j--;
			}

			a[j+1] = key;
			i++;

		} 
	}


	 public static void printArray(int[] a)
	{
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


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
        
        System.out.println("Original array:");
        printArray(a);
        
        iShort(a,n);
        
        System.out.println("Sorted array:");
        printArray(a);
    
	}
}

