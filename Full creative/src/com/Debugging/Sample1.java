package com.Debugging;

public class Sample1 {
	
void methodOne(){
	System.out.println("1");
}
void methodTwo(){
	System.out.println("2");
}
void  methodThree(){
	System.out.println("3");
}
	public static void main(String[] args) {
		Sample1 obj=new Sample1();
		obj.methodTwo();
		obj.methodOne();
		obj.methodThree();

	}

}
