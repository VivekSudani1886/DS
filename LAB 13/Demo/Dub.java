public class Dub{
	class Node {
		int data;
		Node lpter;
		Node rpter;

		Node(int data){
			this.data = data;
			this.rpter = null;
			this.lpter = null;
		}	
	}

	Node head;
	Node tail;

	public Dub(){
		this.head = null;
		this.tail = null;
	}


	public void inserAtFirst(int data)
	{
		Node newNode = new Node(data);

		if(head == null ){
			head = newNode;
			tail = newNode;
		}
		else{
			newNode.rpter = head;
			head.lpter = newNode;
			head = newNode;
		}
	}



	public void inserAtLast(int data)
	{
		Node newNode = new Node(data);

		if(head == null ){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.rpter = newNode;
			newNode.lpter = tail;
			tail = newNode;
		}
	}


	public void display() {
        
        Node save = head;
        while (save != null) {
            System.out.print(save.data);
            
            save = save.rpter;
        }
        System.out.println();
    }




}