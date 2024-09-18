import java.util.*;

class Node{
	int data;
	Node Lpter;
	Node Rpter;

	public Node (int data){
		this.data = data;
		Lpter = null;
		Rpter = null;
	}
}
class BSTree{
	public Node insert(Node root,int data){
		if (root == null) {
			root = new Node(data);
		}
		else if(root.data > data){
			root.Lpter = insert(root.Lpter,data);	
		}
		else{
			root.Rpter = insert(root.Rpter,data);
		}
		return root;
	}

	public  static void inorder(Node root){
		if(root == null){
			return;
		}
		else{	
		inorder(root.Lpter);
		System.out.print(root.data);
		System.out.print(" ");	
		inorder(root.Rpter);	
		}
	}

	public  void preorder(Node root){
			if(root == null){
				return;
			}
			else{
			System.out.print(root.data);
			System.out.print(" ");
			preorder(root.Lpter);
			preorder(root.Rpter);
			}
	}


	public  static void postorder(Node root){
		if(root == null){
			return;
		}
		else{	
		postorder(root.Lpter);
		postorder(root.Rpter);
		System.out.print(root.data);
		System.out.print(" ");	
		}
	}

	public boolean search(Node root,int key){
		if (root == null ) {
			return false;
		}
		else if(root.data>key){
			return search(root.Lpter,key);
		}
		else if(root.data<key){
			return search(root.Rpter,key);
		}
		else{
			return true;
		}
	}



	public Node delete(Node root,int key){
		if (root == null ) {
			return null; 
		}


		/*else if(root.data == key){
			if(root.Lpter == null && root.Rpter == null){
				root = null;
			}
			else if(root.Lpter.Lpter == null && root.Rpter.Rpter == null){
				root.Lpter = null;
			}
			else if(root.Lpter.Rpter != null){
				root.Lpter.Rpter = null;
				root.Lpter = root.Lpter.Rpter;
			}
			else if(root.Lpter.Lpter != null){
				root.Lpter.Lpter = null;
				root.Lpter = root.Lpter.Lpter;
			}
		}*/
		else if(root.data>key){
			root.Lpter = delete(root.Lpter,key);
	   	}
	   	else if(root.data<key){
			root.Rpter = delete(root.Rpter,key);
	   	}
	    else {


			//case 1
			if(root.Lpter == null && root.Rpter == null){
				return null; 
			}


			//case 2
			if(root.Lpter == null){
				return  root.Rpter;
			}
			else if (root.Rpter == null) {
				return  root.Lpter;
			}

			//case 3
			Node ios = root.Rpter;
			while(ios.Lpter != null){
				ios = ios.Lpter;
			}
			root.data = ios.data;
			root.Rpter = delete(root.Rpter,ios.data);

			
		}
		return root;
	}
}


public class Bst{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        


        Node root =null;
        BSTree tree = new BSTree();
    //System.out.println("\nIs 9 is present in BST :" + tree.search(root,9));




        int userChoice;
        System.out.println("Enter => \n1 to insertNode\n" + //
                "2 to print InorderTraversal\n" + //
                "3 to print PreorderTraversal\n" + //
                "4 to print PostorderTraversal\n" + //
                "5 to search\n" + //
                "6 to delete a Node\n" + //
                "7 to Exit");
        while (true) {
            System.out.print("Choice : ");
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                   
			        for (int i = 0;i<n;i++ ) 
			        {
			            System.out.println("Enter element at "+"a["+(i+1)+"]");
			             a[i]  = sc.nextInt();
			             root = tree.insert(root,a[i]);  // Khali root = tree.insert(root,a[i]); karavanu hatu , root ma save karavani hati aa value
			        }

			        // This method taught by Mr.DG;
			        //System.out.println(Arrays.toString(a));
			    break;

				case 2:
					 tree.inorder(root);
					 break;


				case 3:
					tree.preorder(root);
					break;

				case 4:
					tree.postorder(root);
					break;

				case 5:
					System.out.println("enter element to search :");
					int temp =sc.nextInt();
					System.out.println(tree.search(root,temp));	
				
					break;


				case 6:
					System.out.println("enter element to delete :");
					int tempdelete =sc.nextInt();
					root=tree.delete(root,tempdelete);	
					break;	 

                case 7:
                    System.exit(0);  


                default:
                    System.out.println("Enter Valid Input ");
                    break;
            }
        }

	}
}



