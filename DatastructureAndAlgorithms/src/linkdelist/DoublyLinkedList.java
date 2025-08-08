package linkdelist;


public class DoublyLinkedList {
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	Node head = null;
	Node tail = null;
	public void insertAtBegin(int value)
	{
		Node newNode = new Node(value);
		
//		if(head == null)
//		{
//			head = newNode;
//			tail = newNode;
//		}
//		else {
//			head.prev = newNode;
//			newNode.next = head;
//			head = newNode;
//		}
		 newNode.next = head;
		 if(head == null)
		 {
			 head = newNode;
			 tail = newNode;
		 }
		 else {
			head.prev = newNode;
		 }
		 head = newNode;
	}
	public void display() {
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public void displayReversal() {
		Node temp = tail;
		
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
	}
//	insert at specific position
	public void insertAtPos(int pos ,int value)
	{
		if(pos == 1)
		{
			insertAtBegin(value);
			return;
		}
		
		Node temp = head;
		Node newNode = new Node(value);
		for(int i=1;i<pos - 1;i++)
		{
			temp = temp.next;
			if(temp == null)
			{
				System.out.print("Position Inavlalid");
				return;
			}
			
		}
			newNode.next  = temp.next;
			newNode.prev = temp;
			
			if(temp.next == null)
			{
				tail = newNode;
			}
			else {
				temp.next.prev = newNode;
			}
			temp.next = newNode;
			
		
//		now we stopped the temp at pos - 1 ; 
	}
	public void deleteAtBegin()
	{
		head = head.next;
		if(head == null)
		{
			tail = null;
		}
		else
		{
			head.prev = null;
		}
		
	}
	public void deletAtPos(int pos)
	{
		if(pos == 1)
		{
			deleteAtBegin();
			return;
		}
		Node temp = head;
		Node prev = null;
		for(int i=1;i<pos;i++)
		{
			prev = temp;
			temp = temp.next;
			if(temp == null)
			{
				System.out.print("List Is Empty.....!");
				return;
			}
		}
		
		prev.next = temp.next;
		if(temp.next == null)
		{
			tail = temp.prev;
			tail.next = null;
		}
		else {
			temp.next.prev = prev;
		}
		
	}
}
