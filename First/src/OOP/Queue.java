package OOP;

public class Queue {
	
	int queue[] = new int[5];
	
	int front = 0;
	int rear = 0;
	
//	adding element:
	public void Enqueue(int value)
	{
		if(rear==5){
			System.out.print("!.....Queue is Full.....!");
		}
		else
		{
			queue[rear++] = value;
		}
	}
//  removal of element: 
	public void Dequeue()
	{
		if(rear == front)
		{
			System.out.print("!.....Queue is Empty.....!");
		}
		else
		{
			System.out.print(".....This element will be removed....."+queue[front]);
			
       		for(int i=0;i<rear-1;i++)
			{
				queue[i] = queue[i+1];
			}
       		
       		if(rear < 5)
       		{
       			queue[rear] = 0;
       		}
       		
       		rear--;
		}
	}
	
	public void display()
	{
		if(rear == front)
		{
			System.out.print("The queue is Empty");
		}
		else
		{
			for(int i=0;i<rear;i++)
			{
				System.out.print(queue[i]);
			}
		}
	}
	
	public void front()
	{
		if(rear == front)
		{
			System.out.print("Queue is empty");
		}
		else {
			System.out.print(queue[front]);
		}
	}
}
