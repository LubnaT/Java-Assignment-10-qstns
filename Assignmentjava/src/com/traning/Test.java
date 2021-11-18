package com.traning;

public class Test {
	
	Test(int a, int b)
	{
		System.out.println("a = "+a+"b = "+b);
	}

	Test(int a, float b)
	{
		System.out.println("a= "+a+"b= "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 18;
		int b = 10;
		
		Test t = new Test(a, b);
		
		

	}

}
