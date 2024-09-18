import java.util.*;

public class B_6{
    public static void main(String[] args){
          
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your No. : ");
        int f = sc.nextInt();

        System.out.println("Enter Your Power : ");
        int p = sc.nextInt();

        int ans = 1;
        
        for(int i=1;i<=p;i++){
            
            ans *= f;
        }

        System.out.println("Power Of"+f+" Is = "+ans);
    }
}