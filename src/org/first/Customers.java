package org.first;

import java.util.LinkedList;

public class Customers  {
	public static void main(String[] args) {
		
			Encapsulation s=new Encapsulation();
			
			s.setName("gopi");
		
			s.setNum(112);
			
			Encapsulation s1=new Encapsulation();
			
			s.setName("priya");
			s.setNum(134);
			
			LinkedList<Encapsulation> li=new LinkedList<Encapsulation>();
			li.add(s);
			li.add(s1);
			for (int i = 0; i <=li.size(); i++) {
				System.out.println(li.get(i).getName());
				System.out.println(li.get(i).getNum());

				
			}
			
		}
	}


 