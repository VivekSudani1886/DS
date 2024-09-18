import java.util.Scanner;

class Stack{
    Scanner sc = new Scanner(System.in);
    int top=-1;
    char [] a;
    public Stack(int n){
        
        a = new char[n];
    }

    void push(char data){
        if(top==a.length-1){
            System.out.println("overflow");
            return;
        }
        top++;
        a[top] = data;
    }

    char pop(){
        if(top==-1){
            System.out.println("under flow");
            return 'c';
        }
        char x = a[top];
        top--;
        return x;
    }

    
}

public class A_39 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        Stack s = new Stack(str.length());
    }
}