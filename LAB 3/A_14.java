import java.util.*;

public class A_14 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number : ");
        int m = sc.nextInt();

        System.out.print("Enter Ending Number : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = m; i <= n; i++){

            sum += i;
        }

        System.out.println(sum);
    }
}