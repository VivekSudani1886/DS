import java.util.*;

public class A_5{
	 public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
         System.out.println("enterr no");
         double n = sc.nextDouble();
         double ans = fact(n);
         System.out.println("your ANS IS "+ans);

	 }

	 public static double  fact(double n){
           if(n==1){
           	return 1;
           }
           else{
           	return (n*fact(n-1));
           }
	 }
}