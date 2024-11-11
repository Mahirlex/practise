package newfile.gitlab;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet u=new HashSet();
		u.add(12);
		u.add("mahi");
		u.add(1.22f);
		u.add("show");
		u.add("orange");
		u.add('t');
		System.out.println(u.hashCode());
		System.out.println(u.containsAll(u));
		System.out.println(u.isEmpty());
		//u.clear(); clear everything
		System.out.println(u.toArray());
		System.out.println(u.remove("mahi"));
		System.out.println(u.equals(u));
		System.out.println(u);
		
	}

}
