package org.first;

public class Empolyee {
	public static void main(String[] args) {
	String s="suganthi gopinath";
	String s1= " ";
	String s2="Java";
	
	
	char charAt = s.charAt(5);
	System.out.println(charAt);
	
	int indexOf = s.indexOf("t");
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf("a");
	System.out.println(lastIndexOf);
	
	int compareTo = s1.compareTo(s2);
	System.out.println(compareTo);
	
	int length = s.length();
	System.out.println(length);
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	String trim = s.trim();
	System.out.println(trim);
	
	
	String replace = s.replace("a", "s");
	System.out.println(replace);
	
	String substring = s.substring(5);
	System.out.println(substring);
	
	String replaceAll = s.replaceAll("suganthi", "guna");
	System.out.println(replaceAll);
	
	String concat = s1.concat(s2);
	System.out.println(concat);
	
	
    String substring2 = s.substring(6, 13);
	System.out.println(substring2);
	
	boolean contains = s.contains("n");
	System.out.println(contains);
	
	boolean startsWith = s.startsWith("u");
	System.out.println(startsWith);
	
	boolean endsWith = s.endsWith("h");
	System.out.println(endsWith);
	
	
	boolean equals = s1.equals(s2);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s1.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	
	boolean empty = s1.isEmpty();
	System.out.println(empty);
	
	
	
	
	
	}

}
