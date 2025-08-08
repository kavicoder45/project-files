package queue;

public class Main {
	public static void main(String[] args)
	{
		
//		QueueUsingArray<String> q = new QueueUsingArray<>();
		QueueUsingLL q = new QueueUsingLL();
		q.enqueue(1);
		q.enqueue(2);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(1);
		q.enqueue(2);
		System.out.println(q.dequeue());
		
	}
	
}
 