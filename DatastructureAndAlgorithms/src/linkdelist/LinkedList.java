package linkdelist;

public class LinkedList {
	
	int posCount;
//	initial position Count: 
	LinkedList(){
		posCount = 0;
	}
	
	class Node{
		int data;
		Node next;
		
		public Node(int value) {
			this.data = value;
			this.next =null;
		}
	}
	
	Node tail = null;
	Node head = null;
	public void append(int data) {
		Node newNode = new Node(data);
		
		if(head == null ) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		posCount++;
	}
//	inersertAtPos();
	public void insertAtPos(int pos,int value) {
		Node newNode = new Node(value);
		Node temp = head; 
		if(pos==1)
		{
			insertAtBeginning(value);
		}
		
		int count = pos-1;
		int i = 1;
		while(temp!=null) {
			if(i==count) {
			 newNode.next = temp.next;
			 temp.next= newNode;
			 break;
			}
			temp = temp.next;
			i++;
		}
		
	}
//	deleteAtPos();
	public void deleteAtPos(int pos) {
		Node temp = head;
		Node prev = null;
		if(pos==1) {
			head  = head.next;
			return;
		}
		
		int i = 1;
		while(temp!=null) {
			if(i==pos) {
				prev.next = temp.next;
				break;
			}
			prev = temp;
			temp = temp.next;
			i++;
		}
		
		
	}
//	insertAtBegin()
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		posCount++;
		
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
		System.out.print(temp.data);
		temp = temp.next;
		}
	}
}
