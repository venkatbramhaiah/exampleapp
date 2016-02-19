package com.Debugging;

import java.util.Scanner;

public class Exceptionexample {

	public static void main(String[] args) {
		
	 try{
		Scanner sc=new Scanner(System.in);
	 System.out.println("enter n value: ");
	 int n=sc.nextInt();
	 System.out.println("enter d value:  ");
	 int d=sc.nextInt();
	 int res=n/d;
	 System.out.println("result is "+res);
	
	 System.out.println("enter new String : ");
	 String str1=sc.next();
	 int i=Integer.parseInt(str1);
	 System.out.println(i);
	 
	 String str2=null;
	 System.out.println(str2.length());
	 
	 int a[]=new int[5];
	 System.out.println("enter value ");
	 a[5]=sc.nextInt();
	 
	 
	 }catch(ArithmeticException ae){ System.out.println(ae); }
	  catch(NumberFormatException nfe){ System.out.println(nfe); }
	  catch(NullPointerException npe){ System.out.println(npe); }
	  catch(ArrayIndexOutOfBoundsException aie) { System.out.println(aie); }
	 
	 finally{
		 System.out.println("complet");
	 }

	}

}
