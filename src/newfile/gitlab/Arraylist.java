package newfile.gitlab;

public class Arraylist {
	public static void main(String[] args) {
		Arraylist list = new Arraylist();// Size 0, Capacity 0 
		
		 // Object[] elementData = {}   ->   Object[] elementData = new Object[0]; 
		list.add("Hello"); // Capacity 10, size 0  Object[] elementData = new Object[10]; elementData[0] = "Hello"
		list.add("Hello");// Capacity 10, size 1  elementData[1] = "Hello"
		list.add("Hello");; //capacity will be 10 size is 2
		list.add("hello"); //capacity will be 10 size is 3 index[3]="hello"
}

	private void add(String string) {
		
		
	}
}