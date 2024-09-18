import java.util.*;
public class ShellSort
{

        public static void shellSort(int[] arr) 
        {
            // wost case O(n sq) // avg case O(n log n)
                int n = arr.length;
                for (int gap = n / 2; gap >= 1; gap /= 2) {
                    for (int j = gap; j < n; j++) {
                        for (int i = j - gap; i >= 0; i -= gap) {
                            if (arr[i + gap] > arr[i])
                                break;
                            else {
                                int temp = arr[i + gap];
                                arr[i + gap] = arr[i];
                                arr[i] = temp;
                            }
                        }
                    }
                }
                System.out.println("ShellSort:" + Arrays.toString(arr));
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

        shellSort(arr);      
    }
}
