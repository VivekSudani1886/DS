import java.util.*;
public class Msort_A96{

	public static int[] a;

	public static void mergeSort(int low,int high){
		if(low<high){
			int mid = ((low+high)/2);
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			merge(low,mid,high);
		}
	}

	public  static void merge(int low, int mid,int high){
		int h,i,j,k;
		int[] b = new int[high-low+1];
		h = low;
		i = low;
		j = mid+1;


		while(h<=mid && j<=high){
			if (a[h] <= a[j]) {
				b[i-low] = a[h];
				h = h+1;
			}
			else{
				b[i-low] = a[j];
				j= j+1;
			}
			i = i+1 ;   
		}


		if(h>mid){
			for (k = j;k <= high;k++ ) {
				b[i-low] = a[k];
				i++;
			}
		}
		else{
			for (k = h;k <= mid;k++ ) {
				b[i-low] = a[k];
				i++;
			}
		}

		
		for ( k = 0;k<b.length ;k++ ) {
				a[k+low] = b[k];
		}	
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no size of array");
        int n = sc.nextInt();
        a = new int[n];
        int low = 0;
        int high = n-1;
        
        for (int i = 0;i<n;i++ ) {
            System.out.print("Enter element at "+"a["+(i+1)+"] : " +" ");
             a[i]  = sc.nextInt();  
        }

		mergeSort(low,high);
        System.out.print("Sorted array:");
        
        for (int i = 0;i<a.length ;i++ ) {
        	System.out.print(a[i]+" ");
        }
	}

}