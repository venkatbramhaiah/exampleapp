package com.Javacore;

public class Useconstructor
{
	int n;
	String str;
	Useconstructor(int age, String name)
	{
		n =age;
		str=name;
	}
	void display(){
		System.out.println(str+ " age is "+ +n);
	}
	public static void main(String[] args) 
	{
		Useconstructor obj = new Useconstructor(22,"venkat");
		obj.display();
	}
}
