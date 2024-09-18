import java.util.Scanner;

public class C_28 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your String");
        String s1 = sc.next();

        String[] s = new String[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            s[i] = s1.charAt(i) + "";
        }

        System.out.println((int) s1.charAt(0));

        System.out.println("Before:" + s1);
        s1 = "";

        for (int i = 0; i < s.length; i++) {
            if (((int) s[i].charAt(0)) <= 122 && 97 <= ((int) s[i].charAt(0))) {
                s[i] = s[i].toUpperCase();
            } else {
                s[i] = s[i].toLowerCase();
            }
            s1 = s1 + s[i];
        }

        System.out.println("After:" + s1);
    }
}