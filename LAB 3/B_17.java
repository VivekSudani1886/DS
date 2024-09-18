import java.util.*;

public class B_17 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n ; i++){

            System.out.println("Enter Value In a["+i+"]");
            a[i] = sc.nextInt();
        }

        for( int i=0;i<n;i++){
            for(int j=(i+1);j<n;j++){

                if(a[i]==a[j]){
                    System.out.println("Duplicate Is Available");
                    return;
                }
            }
        }

        System.out.println("Duplicate Is Not Available");
    }
}