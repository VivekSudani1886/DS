import java.util.*;

// import package.temp;

public class CirDemo
{
	public static void main(String[] args) 
	{
		Cir cir1 = new Cir();
		Scanner sc = new Scanner(System.in);


        Cir cir2 = new Cir();
        cir2.InsertAtFirst(5);
        cir2.InsertAtFirst(10);
        cir2.InsertAtFirst(15);
        cir2.InsertAtFirst(20);
        cir2.InsertAtFirst(25);
        int userChoice;
        System.out.println("Enter => \n1 to insertNode at first\n" + //
                "2 to insertNode at last\n" + //
                "3 to insertNode in order\n" + //
                "4 to delete a Node\n" + //
                "5 to copy LinkedList\n" + //
                "6 to display LinkedList\n" + //
                "7 to Reverse a LinkedList\n "+ //
                "8 to Sort a LinkedList\n "+ //
                "9 to Check Equality\n"+//
                "10 to Exit");
        while (true)
        {
            System.out.print("Choice : ");
            userChoice = sc.nextInt();
            switch (userChoice) 
            {
                case 1:
                    System.out.print("Enter Element To Insert : ");
                    int n = sc.nextInt();
                    cir1.InsertAtFirst(n);
                    break;
                   
                case 2:
                    System.out.print("Enter Element To Insert : ");
                    int m = sc.nextInt();
                    cir1.InsertAtLast(m);
                    break;

                // case 3:
                //     // System.out.print("Enter Element To Insert : ");
                //     // int x = sc.nextInt();
                //     // cir1.InsertInOrder(x);
                //     break;


                 case 6:
                   cir1.Display();
                    break;    
            }
        }
	}
}