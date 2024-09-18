public class QueueDemo
{

		int len;
		int f;
		int r;
		int arr[];

	QueueDemo(int len)
	{
	 this.f = -1;
	 this.r = -1;
	 this.len= len;
	 arr = new int[len];	
	}

	public void enqueue(int n)
	{
		// if(r<=-1){
		// 	System.out.println("underflow");
		// 	return;
		// }
		

			if(r>=len)
			{
				System.out.println("queue overflow");
			}

			else
			{
					
				r++;
				arr[r] = n;

				if(f <= -1)
				{
				     f = 0 


				     ;
			      }
			}
	}	

		public void dequeue(int n)
		{
			if(r<=-1){
				System.out.println("underflow");
				return;
			}
		

			// else
			// {
					//ronak thesiya
					//6351247957
			// 	r++;
			// 	arr[r] = n;

			// 	if(f <= -1)
			// 	{
			// 	     f++;
			//       }
			// }
		}	



	public void display()
	{
		// if(r==0){
		// 	System.out.println("queue is empty");
		// }
		for(int i =f ;i <= r;i++ ){
			System.out.print(arr[i] + " " );
		}
	}



	public static void main(String[] args) {
		QueueDemo q1 =  new QueueDemo(5);
		q1.enqueue(3);
		q1.enqueue(5);
		q1.enqueue(8);
		q1.display();
	}

	
}