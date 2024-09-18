import java.util.*;

public class A_16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n ; i++){

            System.out.println("Enter Value In a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int p1 = 0;
        int p2 = 0;

        for(int i = 0; i < n; i++){

            if( max < a[i]){

                max = a[i];
                p1 = i;
            }

            if( min > a[i]){

                min = a[i];
                p2 = i;
            }
        }

        System.out.println("Maximum Number Is "+max+" At Index "+p1);
        System.out.println("Minimum Number Is "+min+" At Index "+p2);
    }
}