package com.traning;

public class Testt {
	
	int i;
	
	Testt(int k)
	{
		i=k;
	}
 
	Testt(int k, int m)
	{
		System.out.println("we are assigning max value of k or m to i");
		
		if(k>m)
		{
			i=k;
		}
		else
		{
			i=m;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testt t1 = new Testt(10);
		Testt t2 = new Testt(20, 30);
		System.out.println(t1.i);
		System.out.println(t2.i);
		

	}

}
