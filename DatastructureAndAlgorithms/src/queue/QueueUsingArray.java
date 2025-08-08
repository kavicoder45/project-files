package queue;

public class QueueUsingArray<T> {

	final static int MAX_SIZE =  30;
	int front;
	int rear;
	@SuppressWarnings("unchecked")
	T[] arr =(T[]) new Object[MAX_SIZE];
	QueueUsingArray(){
		rear = -1;
		front = -1;
	}
	
	public void enqueue(T i)
	{
		if(front == -1)
		{
			front++;
		}
		if(rear == MAX_SIZE - 1 )
		{
			System.out.print("Index out of bounds" );
			return;
		}
		arr[++rear] = i;
	}
	
	public T dequeue()
	{
		if(rear == -1)
		{
			System.out.print("Queue is empty");
			return null;
		}
		T data = arr[front];
		for(int i = 1; i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}
		rear--;
		return data;
	}
	
	
}
