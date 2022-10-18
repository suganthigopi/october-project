package org.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class Task{
	public static void main(String[] args) {
		Map<String,Integer>m=new LinkedHashMap();
		m.put("sugu", 10);
		m.put("gopi", 800);
		m.put("kavi", 82);
		m.put("muthu", 240);
		m.put("mathi", 500);
		
		
		
		Set<String> key = m.keySet();
		System.out.println(key);
		
		Collection<Integer> values = m.values();
		System.out.println(values);
		
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		
		
		for (Entry<String, Integer> x : entrySet) {
			System.out.println(x);
			String key2 = x.getKey();
			System.out.println(key2);
			Integer value = x.getValue();
			System.out.println(value);
			
		}
	}
		
}


