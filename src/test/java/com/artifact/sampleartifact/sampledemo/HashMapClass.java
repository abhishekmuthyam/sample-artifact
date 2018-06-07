package com.artifact.sampledemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

public static void main(String[] args) {
		
		HashMapClass hs =new HashMapClass();
		
		hs.validateMap();
		
	}

	private void validateMap() {
		
		HashMap<Integer, String> map =new HashMap<>();
		
		map.put(1, "value1");
		map.put(2, "value2");
		map.put(3, "value1");
		map.put(4, "value4");
		
			Set<Entry<Integer, String>> entrySet = map.entrySet();
			
			int list =map.size();
			
			System.out.println(list);
			
			Set<Integer> set = new HashSet<Integer>(map.size());
			
			System.out.println(set.size());

			for (Entry<Integer, String> entry : entrySet) {

	            if (entry.getValue() != null) {
	                System.out.println("Duplicate element from array : "
	                        + entry.getKey());
	            }
	        }
	}
	

	
}
