import java.util.*;

public class A_13{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n ; i++){

            System.out.println("Enter Value In a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){

            System.out.println(a[i]);
        }
    }
}