import java.util.*;

public class B_26 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Array Size : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){

            System.out.print("Enter Value In a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Second Array Size : ");
        int m = sc.nextInt();

        int[] b = new int[m];

        for(int i = 0; i < m; i++){

            System.out.print("Enter Value In b["+i+"] : ");
            b[i] = sc.nextInt();
        }

        int[] ans = new int[n+m];

        for(int i = 0; i < n; i++){

            ans[i] = a[i];
        }

        for(int i = 0; i < m; i++){

            ans[n+i] = b[i];
        }

        for(int i = 0; i < (n+m); i++){

            System.out.println(ans[i]);
        }
    }
}