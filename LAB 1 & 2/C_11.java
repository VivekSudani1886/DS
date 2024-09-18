import java.util.*;

public class C_11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter No. : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){

                sum+= j;
            }
        }

        System.out.println("Sum Of Series Is : "+sum);
    }
}