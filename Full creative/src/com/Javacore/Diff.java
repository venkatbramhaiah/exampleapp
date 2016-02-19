package com.Javacore;

import java.util.Scanner;

public class Diff {

	public static void main(String[] args) {

		final int i=33;
		try{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter i value");
	//	int i=sc.nextInt();
		int j=sc.nextInt();
		}catch(Exception e)
		{
		System.out.println(e);
		}
		finally {
			System.out.println("hello");
		}
	}

}
