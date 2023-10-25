package module2._11_MapCollections.lessons.TreeMap;

import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		
		Map<Integer,Integer> tree = new java.util.TreeMap<>();
		
		tree.put(1, 5);
		
		System.out.println(tree.get(1));

	}

}
