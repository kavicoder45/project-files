package stack;

class Node<T>{
	T data;
	Node<T> next;
	public Node(T value) {
		data = value;
		next = null;
	}
}
//stack -> last in first out: 
//so if you impelement the list for insert at beginning it will easy to do stack operation: 
public class ListImpStack<T> {
	
	Node<T> top;
	
	ListImpStack(){
		top = null;
	}
	public void push(T value)
	{
		Node<T> newNode = new Node<>(value);
		newNode.next = top;
		top = newNode;
	}
	public T pop() {
		if(top == null)
		{
			throw new IndexOutOfBoundsException("stack is empty");
		}
		T val = top.data;
		top  = top.next;
		return val;
	}
	public T peek()
	{
		return top.data;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public void display() {
		Node<T> temp = top;
		while(temp!=null)
		{
			System.out.print("The data : " + temp.data);
			temp = temp.next;
		}
	}
}
