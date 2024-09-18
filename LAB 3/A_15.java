import java.util.*;

public class A_15 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int sum = 0;
        float avg = 0;

        for(int i = 1; i <= n; i++){

            sum += i;
        }

        avg = (sum/n);

        System.out.println(avg);
    }
}