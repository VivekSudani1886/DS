import java.util.*;

class Tree{
	class Node{
		int info;
		Node left;
		Node right;

		public Node(int info){
				this.info = info;
				this.left = null;
				this.right = null;
		}
	}

		Node root;
		

		public   Node createTree(int[] a,int i){
			if (i >= a.length) {
				return null;
			}
			Node temp =  new Node(a[i]); 	
			temp.left = createTree(a,2*i+1);
			temp.right = createTree(a,2*i+2);
			return temp;
		}

		public  void prefix(Node root){
			if(root == null){
				return;
			}
			else{
			System.out.print(root.info);
			System.out.print(" ");
			prefix(root.left);
			prefix(root.right);
			}
		}


	public  static void postfix(Node root){
		if(root == null){
			return;
		}
		else{	
		postfix(root.left);
		postfix(root.right);
		System.out.print(root.info);
		System.out.print(" ");	
		}
	}



	public  static void infix(Node root){
		if(root == null){
			return;
		}
		else{	
		infix(root.left);
		System.out.print(root.info);
		System.out.print(" ");	
		infix(root.right);	
		}
	}
		


}
	



public class TreeDemo{
		public static void main(String[] args) {
		Tree t1 = new Tree();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0;i<n;i++ ) 
        {
            System.out.println("Enter element at "+"a["+(i+1)+"]");
             a[i]  = sc.nextInt();  
        }
        
		int i = 0;

		t1.root = t1.createTree(a,i);
		System.out.print("prefix : ");
		t1.prefix(t1.root);
		System.out.println("");

		System.out.print("postfix : ");
		t1.postfix(t1.root);
		System.out.println(" ");
		System.out.print("infix : ");
		t1.infix(t1.root);

		}
}