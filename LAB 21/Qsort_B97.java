import java.util.*;
public class Qsort_B97{
	
	public static void quickSort(int arr[], int low, int high) {// avg case O(n Log n)
                                                                // worst case O(n sq) (when
                                                                // elements are already arranged in ascending or
                                                                // decending
                                                                // divide and conquer algo
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }

        System.out.println("QuickSort:" + Arrays.toString(arr));
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }


    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0;i<n;i++ ) 
        {
            System.out.println("Enter element at "+"a["+(i+1)+"]");
             arr[i]  = sc.nextInt();  
        }

        quickSort(arr,0,arr.length-1); 
    }
}