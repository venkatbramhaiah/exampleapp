package com.Javacore;

public class Stringdiff {

	public static void main(String[] args) {

		System.out.println("String is immutable=========");
		String str="venkat";
		str.concat("naveen");
		System.out.println(str);
		
		System.out.println("StringBuilder is mutable==========");
		StringBuilder sb=new StringBuilder("venkat");
		sb.append(" naveen");
		System.out.println(sb);
	}

}
