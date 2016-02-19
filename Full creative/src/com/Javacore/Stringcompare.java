package com.Javacore;

public class Stringcompare {

	public static void main(String[] args) {

		String s1="venkat";
		String s2="venkat";
		String s3=new String("venkat");
		if(s1 == s2){
			System.out.println("both are same");
		}else
		{
			System.out.println("both are different");
		}
		
		System.out.println();
		
		if(s3.equals(s2)){
			System.out.println("both are same");
		}else
		{
			System.out.println("both are different");
		}
	}

}
