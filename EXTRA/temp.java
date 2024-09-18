import java.util.*;
public class temp {
    public static void main(String[] args) {

    	Node newNode1 = new Node(1);
    	Node newNode2 = new Node(2);
    	Node newNode3 = new Node(3);
    	Node newNode4 = new Node(4);
    	Node newNode5 = new Node(5);
    	Node newNode6 = new Node(6);

    	newNode1.left = newNode2;
    	newNode1.right = newNode3;
    	newNode2.left = newNode4;
    	newNode2.right = newNode5;
    	newNode3.right = newNode6;


    	// System.out.println(newNode1.left.left.info);




    	Tree t1 =  new Tree();
    	t1.root = newNode1;


  	boolean flag = true;


  	while(true){
  		// System.out.println("enter the root node");
  		// Scanner sc = new Scanner(System.in);
  		// Node root.info = sc.nextInt();
  		System.out.println("1 for prefix");
        System.out.println("2 for postfix");
        System.out.println("3 for infix");
        int m = sc.nextInt();
        switch(m){
        	case 1 :
        		prefix(t1.root);
        		break;
        	case 2 :
        		postfix(t1.root);
        		break;
        	case 3:
        		infix(t1.root);
        		break;
        	default:
        			System.out.println("maro bahi joy ne no nakh");		
        }


  	}
    // System.out.println("");

  
  		// System.out.println("prefix :");
    // 	t1.prefix(t1.root);
    // 	System.out.println("");
    // 	System.out.println("infix : ");
    // 	t1.infix(t1.root);
    // 	System.out.println("");
    // 	System.out.println("postfix : ");
    // 	t1.postfix(t1.root);





    }
}

class Node{
    int info;
    Node left;
    Node right;
	    Node(int x){
	        this.info = x;
	    }
	} 




class Tree{


	Node root;


	



	public static void prefix(Node root){
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
