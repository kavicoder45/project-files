package hashimpl;

public class Main {
	public static void main(String[] args)
	{
		HashImplementation<String,Integer> map = new HashImplementation<>("Kaviarasan",12);
		System.out.println(map.getKey());
		System.out.println(map.getValue());
		
	}

}
