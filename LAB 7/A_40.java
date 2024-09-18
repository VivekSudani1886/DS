import java.util.*;
public class A_40{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Stack<Character> a = new Stack<>();
		Stack<Character> b = new Stack<>();
		System.out.println("Enter a String");
		String str = sc.next();
		

		
		for (int i = 0;i<str.length()  ;i++ ) {
			if(str.charAt(i)== 'a')
			a.push(str.charAt(i));
			else{
				b.push(str.charAt(i));
			}
		}

		if(a.size() == b.size()){
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
		

	}
}