import java.util.*;

public class HeapSort{
	 static int arr[]; 
	public static void heapsort(int[] arr){
		int n = arr.length;   
		buildMaxHeap();
		for (int i = n-1; i>=0 ; i--) {
			swap(0,i);
			heapify(i,0);
		}

		System.out.println("HeapSort:" + Arrays.toString(arr));
	}
	public static void buildMaxHeap(){
		int n = arr.length;
		for (int i = (n/2) - 1; i>=0 ; i--) {
			heapify(n,i);
		}
	}
	public static void heapify(int n,int i){
		int maxIndex = i;
		int leftchild = 2*i+1;
		int rightchild = 2*i+2;

		if (leftchild < n && arr[leftchild] > arr[maxIndex]) {
			maxIndex = leftchild;
		}
		if (rightchild < n && arr[rightchild] > arr[maxIndex]) {
			maxIndex = rightchild;
		}
		if (i != maxIndex) {
			swap(i,maxIndex);
			heapify(n,maxIndex);
		}
	}
	public static void swap(int i,int j){
		// arr[i] = arr[i]^arr[j];
		// arr[j] = arr[i]^arr[j];
		// arr[i] = arr[i]^arr[j];

		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no size of array");
        int n = sc.nextInt();
         arr = new int[n];
        
        for (int i = 0;i<n;i++ ) 
        {
            System.out.println("Enter element at "+"a["+(i+1)+"]");
             arr[i]  = sc.nextInt();  
        }

        heapsort(arr);
    
	}

}