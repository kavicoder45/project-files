package queue;

public class QueueUsingLL {
	
	class Node{
		int data;
		Node next;
		
		Node(int value)
		{
			this.data = value;
			this.next = null;
		}
	}
	
	Node front;
	Node rear;
	
	QueueUsingLL(){
		front = null;
		rear = null;
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if(front == null && rear == null)
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
			rear.next = newNode;
			rear = newNode;
		}
	}
	public int dequeue() {
		if(front == null)
		{
			System.out.print("Queue is empty");
			return 0;
		}
		int data = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		return data;
	}

}
