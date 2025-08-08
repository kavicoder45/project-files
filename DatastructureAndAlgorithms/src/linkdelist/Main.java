package linkdelist;

public class Main {
	public static void main(String[] args)
	{
		LinkedList ls = new LinkedList();
//		ls.insertAtBeginning(1);
//		ls.insertAtBeginning(2);
//		ls.insertAtBeginning(3);
		ls.append(1);
		ls.append(2);
		ls.append(3);
		ls.append(4);
		ls.append(5);
//		ls.display()
		ls.display();
		System.out.println();
		ls.deleteAtPos(1);
		ls.display();
	}

}
