import java.util.*;
public class A7_39{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		System.out.println("Enter a String");
		String str = sc.next();
		
		st.push('c');
		int temp = 0;
		// for (int i = 0;i<str.length()  ;i++ ) {
		// 	if(str.charAt())
		// 	st.push(str.charAt(i));
		// 	 temp = i;
		// }

		int i =0;

		while(str.charAt(i) != 'c'){
			st.push(str.charAt(i));
			 i++;
			 temp = i;

		}
		boolean flag = false; 
		char ch;
		for ( int j = temp+1;j<str.length() ;j++ ) {
			ch = st.pop();
			if(str.charAt(j) == ch){
				continue;
			}
			else{
				System.out.println("invalid");
				flag = true;
			}
		}

		if (flag ==false) {
			System.out.println("valid String");
		}
		

	}
}