package newfile.gitlab;
import java.util.ArrayList;
public class Arraylists {
	public static void main(String args[]) {
	ArrayList<String> u=new ArrayList<>(4);
	System.out.println(u);
	u.add("hi");
	System.out.println(u.size());
	u.add("hello");
	u.add("this");
	u.add("method");
	u.add("is add");
	System.out.println(u);
	u.remove(1);
	System.out.println(u);
	
	
	}
}
