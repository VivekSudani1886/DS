import java.util.Scanner;

public class Postfixshortcut{

    public static int G(char next) {
        if (next == '+' || next == '-') {
            return 2;
        } else if (next == '*' || next == '/') {
            return 4;
        } else if (next == '^') {
            return 5;
        } else if (next >= 'a'&& next<='z') {
            return 8;
        }else if(next=='('){
            return 0;
        }
        return -1;
    }
    public static int F(char next) {
        if (next == '+' || next == '-') {
            return 1;
        } else if (next == '*' || next == '/') {
            return 3;
        } else if (next == '^') {
            return 6;
        } else if (next >= 'a'&& next<='z') {
            return 7;
        }else if(next=='('){
            return 9;
        }else if(next==')'){
            return 0;
        }
        return -1;
    }
    public static int R(char next) {
        if (next == '+' || next == '-' || next == '*' || next == '/'||next == '^') {
            return -1;
        }else if (next >= 'a'&& next<='z') {
            return 1;
        }
        return 0;
    }

    public static String getPostfixShortCut(String infix,StringBuffer postfix){
        Stack<String> stk = new Stack<>();
        
        stk.push('(');
        
        for (int i = 0; i < infix.length(); i++) {
            char next = infix.charAt(i);
            if (next >= 'a' && next <= 'z') {
                postfix.append(next);
            } else if (next == '+' || next == '-' || next == '*' || next == '/') {
                while (G(stk.peep(1)) >= G(next)) {
                    postfix.append(stk.pop());
                }
                stk.push(next);
            } else if (next == '^') {
                stk.push(next);
            } else if (next == '(') {
                stk.push(next);
            } else if (next == ')') {
                char temp2 = stk.pop();
                while (temp2 != '(') {
                    postfix.append(temp2);
                    temp2 = stk.pop();
                }
            }
        }
        return postfix.toString();
    }
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String infix = sc.nextLine().toLowerCase() + ")";
        
        StringBuffer postfix = new StringBuffer("");
        
        System.out.println("Postfix : " + getPostfixShortCut(infix, postfix));
    }
}