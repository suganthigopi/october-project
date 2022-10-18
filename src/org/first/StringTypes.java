package org.first;

public class StringTypes {
	public static void main(String[] args) {
		String s="sugu";
		String s1="sugu";
		String concat = s.concat(s1);
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(concat));
		
		StringBuilder s2=new StringBuilder("gopi");
		StringBuilder s3=new StringBuilder("guna");
		
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		StringBuilder append = s2.append(s3);
		System.out.println(append);
	}

}
