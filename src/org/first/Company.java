package org.first;

public class Company {
	public Company() {
		System.out.println("parent default");
	}
	public Company(int id) {
		this();
	System.out.println("parent integer");

}
}