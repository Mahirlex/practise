package newfile.gitlab;
import java.util.LinkedList;
public class Linkedlist {
	public static void main(String[] args) {
		LinkedList m=new LinkedList();
		System.out.println(m.size());
			m.add("hello");
			System.out.println(m.size());
			m.add("coffe");
			m.add(10);
			m.add(10.1f);
			m.add("lets see");
			m.add("lets remove");
			m.add("this too");
			System.out.println(m);
			m.remove(4);
			System.out.println(m);
			m.removeLast();
			System.out.println(m);
			m.addLast("last one");
			System.out.println(m);
			m.addFirst(100);
			System.out.println(m);
			m.removeFirst();
			System.out.println(m);
			for(int a=0;a<=1;a++) {
				System.out.println(m);
			}
	}
}
