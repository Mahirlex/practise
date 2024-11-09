package newfile.gitlab;
import java.util.HashMap;
public class Hashmaps {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>(8);
		map.put("thing", 2);
		map.put("showin", 1);
		map.put("order", 32);
		map.replace("showin", 1, 11);
		map.put("apple", 2);
		map.put("mango", 3);
		map.put("orange", 5);
		map.put("grape", 4);
		System.out.println(map.size());
		System.out.println(map.remove("mango"));
		System.out.println(map.keySet());
		System.out.println(map.containsValue(11));
		System.out.println(map.isEmpty());
		System.out.println(map);
	}
}
