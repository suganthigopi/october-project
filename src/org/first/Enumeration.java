package org.first;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration {

	public static void main(String[] args) {
		Vector<String>v=new Vector<>();
		v.add("sugu");
		v.add("gopi");
		v.add("guna");
		v.add("priya");
		v.add("kiruthu");
//		System.out.println(v);
//		java.util.Enumeration<String> elements = v.elements();
//		while (elements.hasMoreElements()) {
//			String string = (String) elements.nextElement();
//			System.out.println(string);
//			
//		}
//       Iterator<String> iterator = v.iterator();
//       while (iterator.hasNext()) {
//		String string = (String) iterator.next();
//		System.out.println(string);
//		if(string.equals("priya")) {
//			iterator.remove();
//			
//
//		}
//		
//	}
//       System.out.println(v);
		
//		ListIterator<String> listIterator = v.listIterator();
//		while (listIterator.hasNext()) {
//			String string = (String) listIterator.next();
//			System.out.println(string);
//		}
//			while(listIterator.hasPrevious()) {
//				String previous = listIterator.previous();
//				System.out.println(previous);
//				
//			}
			ListIterator<String> listIterator = v.listIterator();
			while (listIterator.hasNext()) {
				String string = (String) listIterator.next();
			System.out.println(string);
			if(string.equals("sugu")) {
				listIterator.add("kumar");
			}
			
			else if(string.equals("priya")){
				listIterator.remove();
				
			}else if(string.equals("kiruthu")) {
				listIterator.set("aaaa");
			}
				
				
				
			
				
			}
			System.out.println(v);
			}
		
		}
	
	


