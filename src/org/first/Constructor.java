package org.first;

import java.util.LinkedList;

public class Constructor {
	private String name;
	private int id;
	private long mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public static void main(String[] args) {
		Constructor a =new Constructor();
		a.setName("sugu");
		a.setId(20);
		a.setMobile(5236987412l);
		
		Constructor a1 =new Constructor();
		a1.setName("gopi");
		a1.setId(10);
		a1.setMobile(9843705212l);
		
		
		LinkedList<Constructor> li=new LinkedList<Constructor>();
		li.add(a);
		li.add(a1);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getName());
			System.out.println(li.get(i).getId());
			System.out.println(li.get(i).getMobile());
			
		}
		
	}
	
	

}

