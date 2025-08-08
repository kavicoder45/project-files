package linkdelist;

public class CircularLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node last;
	CircularLinkedList(){
		last = null;
	}
	
	public void insertAtBeginning(int data)
	{
		Node newNode = new Node(data);
		
		if(last==null)
		{
			last = newNode;
			last.next = last;
		}
		else 
		{
			newNode.next = last.next;
			last.next = newNode;
		}
	}
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		
		if(last == null)
		{
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
	public void display() {
		if(last == null)
		{
			return;
		}
		Node temp = last.next;
		
		do { 
			System.out.print(temp.data);
			temp = temp.next;
		}while(temp!=last.next);
	}
	public int deleteAtBeginning() {
		
		int temp;
		if(last.next == last)
		{
			temp = last.data;
			last = null;
		}
		else {
			temp = last.data;
			last.next = last.next.next;
		}
		return temp;
		
	}
	public int deletAtEnd()
	{
		int val;
		if(last.next == last)
		{
			val = last.data;
			last= null;
			return 0;
		}
		Node temp = last.next;
		while(temp.next!=last)
		{
			temp = temp.next;
		}
		val = temp.next.data;
//		System.out.println(val);
		temp.next = last.next;
		last = temp;
		return val;
	}

}
