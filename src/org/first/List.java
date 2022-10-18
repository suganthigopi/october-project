package org.first;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(123);
		li.add("sugu");
		li.add(10.23);
		li.add('s');
		li.add(false);
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		Object object = li.get(3);
		System.out.println(object);
		System.out.println("***********************");
		 li.add(4, "gopi");
		 System.out.println(li);
		 System.out.println("*************************");
		 li.set(2, 100);
		 System.out.println(li); 
		 
		 boolean contains = li.contains(false);
		 System.out.println(contains);
		 
		 int indexOf = li.indexOf(false);
		 System.out.println(indexOf);
		 
		 int lastIndexOf = li.lastIndexOf(100);
		 System.out.println(lastIndexOf);
		 
		 
		 LinkedList l1=new LinkedList();
		 l1.addAll(li);
		 //System.out.println(l1);
		 l1.add(10);
		 l1.add(100);
		 l1.add(200);
		 System.out.println(l1);
		 
		 l1.removeAll(li);
		 System.out.println(l1 );
		 
		 l1.retainAll(li);
		 System.out.println(l1);
		 
		 
		
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			System.out.println("************************");
			
		}
		

	}

}
