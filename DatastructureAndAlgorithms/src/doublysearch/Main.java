package doublysearch;

public class Main {
	public static void main(String[] args) {
		
	  DoublySearch ds = new DoublySearch();
	   ds.append("A");
	   ds.append("B");
	   ds.append("C");
	   ds.append("D");
	   ds.leftToRight();
	   System.out.println();
	   ds.deleteAtPos(3);
	   ds.leftToRight();
//	   we can also implement delete at last: 
	}

}
