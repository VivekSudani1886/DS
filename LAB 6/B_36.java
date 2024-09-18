import java.util.Scanner;

public class B_36 {
 
    public static void FtoC(double f) {

        System.out.println("Farenhit To Celsuis : "+((f-32)*(5/9)));
    }

    public static void CtoF(double c) {

        System.out.println("Celsuis To Farenhit : "+((9/5)*c)+32);
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Farenhit : ");
        double f = sc.nextDouble();

        System.out.print("Enter Celsuis : ");
        double c = sc.nextDouble();

        FtoC(f);
        CtoF(c);
    }
}