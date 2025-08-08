package OOP;

public class Queuedemo {
	public static void main(String args[])
	{
		Queue q = new Queue();
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		q.Enqueue(6);
		
		
		q.display();
		q.Dequeue();
		q.Dequeue();
		q.display();
	}

}
