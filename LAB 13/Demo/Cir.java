public class Cir
{

	 class Node
	{
		int data;
		Node link;

		public Node(int data)
		{
			this.data = data;
			this.link = null;
		}

	}

	public Node  First = null;
	public Node Last = null;

	public Node  Save = First;
	



	public void InsertAtFirst(int data)
	{
		Node newNode = new Node(data);

		if(First == null)
		{
			newNode.link = newNode;
			First = newNode;
			Last = newNode;
		}
		else
		{
			newNode.link = First;
			Last.link = newNode;
			First = newNode;
		}
	}



	public void InsertAtLast(int data)
	{
		Node newNode = new Node(data);

		if(First == null)
		{
			newNode.link = newNode;
			First = newNode;
			Last = newNode;
		}
		else
		{
			newNode.link = First;
			Last.link = newNode;
			Last = newNode;
		}
	}

	public void Display(){

		if(First == null){
			System.out.println("Linklist is empty");
		}

		Node Save  = First ;

		while(Save != null ){
			System.out.println(Save.data);
			if(Save.link != null){
				System.out.println("→");
			}
			Save = Save.link;

		}
		System.out.println();
	}


}