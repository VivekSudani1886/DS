
public class LinlList{
	public class Node{
		int data;
		Node link;

		public Node(int data){
			this.data = data;
			this.link = null;
		}	
	}

	public Node FIRST = null;

	public void InsertAtFirst(int data){
		Node newNode = new Node(data);

		newNode.link = FIRST;
		FIRST = newNode;
		
	}

	public void InsertAtLast(int data){
		Node newNode  = new Node(data);

		if(FIRST = null){
			newNode.link = null;
			FIRST = newNode;
			return;
		}

		Node SAVE = FIRST;

		while(SAVE.link != null ){
			SAVE = SAVE.link;
		} 

		SAVE.link = newNode;
	}

	public void InsertInOrder(int data){
		Node newNode = new newNode(data);

		if(FIRST == null && newNode.data < = FIRST.data){
		  newNode.link = FIRST;
		  FIRST = newNode;

		  return;
		}

		Node  SAVE = FIRST;

		if(SAVE != null && newNode.data >= ((SAVE.info).data)){
			SAVE = SAVE.link;
		}

		newNode.link = SAVE.link;
		SAVE.link = newNode; 
	}

	public void DisplayLinkedList(){

		if(FIRST == null){
			System.out.println("Linklist is empty");
		}

		Node SAVE  = FIRST ;

		while(SAVE != null ){
			System.out.println(SAVE.data);
			if(SAVE.link != null){
				System.out.println("→");
			}
			SAVE = SAVE.link;

		}
		System.out.println();
	}

	 public int CountNode() {

        int count = 0;

        if (FIRST == null) {
            count = 0;
            return count;
        }

        Node SAVE = FIRST;

        while (SAVE != null) {
            count++;
            SAVE = SAVE.link;
        }

        return count;
    }

    		


}