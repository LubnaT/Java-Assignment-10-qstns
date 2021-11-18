package com.traning;

public class Testing {
	
	int i;
	int j ;
	static int k;
	static int l;
	static {
		int k = 12;
		int l = 17;
		System.out.println(k+" "+l);
		
	}
	
	{
		int i = 20;
		int j = 23;
		System.out.println(i+" "+j);
	}

	 void Add()
	{
		 int m = 22;
		 int n = 12;
		 
		int a;
		a = m + n;
		System.out.println("Sum of i and j is:" + a);
	}
	
	Testing(){
		System.out.println("The end of system");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testing t1 = new Testing();
		t1.Add();

	}

}
