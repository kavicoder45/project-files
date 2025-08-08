package linkdelist;

public class LinkedListReversal {
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	Node head = null;
	Node tail = null;
	public void append(int value)
	{
		Node newNode = new Node(value);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display() {
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
	public void doReversal() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
}
