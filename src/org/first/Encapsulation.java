package org.first;

public class Encapsulation {
	private String name;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	this.name=name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
//public static void main(String[] args) {
//	Encapsulation s=new Encapsulation();
//	
//	s.setName("gopi");
//	String name3 = s.getName();
//	s.setName("sugu");
//	System.out.println(name3);
//	String name2 = s.getName();
//	System.out.println(name2);
//	s.setNum(12345);
//	int num2 = s.getNum();
//	System.out.println(num2);
//}
}
