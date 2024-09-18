import java.util.Stack;

public class PrefixEvaluation {

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  // Convert char to int
            }
            else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String prefixExpr = "-+*2319";
        int result = evaluatePrefix(prefixExpr);
        System.out.println("Result of prefix expression '" + prefixExpr + "' is: " + result);
    }
}
