package doublysearch;

public class DoublySearch {
	int count = 0;
  
	class Node{
		String data;
		Node prev;
		Node next;
		
		Node(String endPoint){
			this.data = endPoint;
			count++;
		}
	}
	
	Node head = null;
	Node tail = null;
	Node current = null;
	
	public void append(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			tail = newNode;
			current = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			current = newNode;
		}
	}
	
	public void leftToRight() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
	
	public void rightToLeft() {
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+" ->");
			temp = temp.prev;
		}
	}
	
	public void insertAtPos(int pos,String value) {
		Node temp = head;
		System.out.println("The Current no of Nodes are : ");
		Node newNode = new Node(value);
		if(pos == 1) {
			return;
		}
		pos = pos - 1;
		int i = 0;
		while(temp!=null) {
			i++;
			if(i==pos) {
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		
	}
	public void deleteAtBegin()
	{
		if(head == null) {
		  System.out.print("There is no node: ");
		}
		else {
			head = head.next;
			if(head == null) {
				tail = null;
			}
			else {
				head.prev = null;
			}
		}
	}
//	easy deletion:
	public void deleteAtPos(int pos) {
		Node temp = head; 
		
		if(pos == 1) {
			deleteAtBegin();
			return;
		}
		
		int i = 0;
		
		while(temp!=null) {
			i++;
			if(i==pos) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				break;
			}
			temp = temp.next; 
		}
	}
	
}
