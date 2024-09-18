import java.util.*;

public class A_21 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] temp = new int[n+1];

        for(int i = 0; i < n; i++){

            System.out.print("Enter Value In a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Element For Insert : ");
        int ele = sc.nextInt();

        System.out.print("Enter Index For Insert : ");
        int pos = sc.nextInt();

        for(int i = 0; i < (n+1); i++){

            if(i < pos){

                temp[i] = a[i];
            }
            else{

                if(pos == i){

                    temp[i]=ele;
                }
                else{

                    temp[i] = a[i-1];
                }
            }
        }

        for(int i = 0; i < (n+1); i++){

            System.out.println(temp[i]);
        }
    }
}