package stack;

import java.util.Arrays;

public class ArrayStack<T> {
	static final int MAX_SIZE = 30;
	  @SuppressWarnings("unchecked")
	T[] arr = (T[])new Object[MAX_SIZE];
	int top;
	
	ArrayStack() {
		top = -1;
	}
	
	public void push(T value)
	{
		if(top == MAX_SIZE - 1)
		{
			throw new IndexOutOfBoundsException("Stack Overflow");
		}
		arr[++top] = value;
	}
	public T pop()
	{
		if(top == -1 )
		{
			throw new IndexOutOfBoundsException("Stack underflow");
		}
		return arr[top--];
	}
	public T peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public void display() {
		System.out.print(Arrays.toString(arr));
	}
}
