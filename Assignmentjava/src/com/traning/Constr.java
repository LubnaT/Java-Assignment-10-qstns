package com.traning;

public class Constr {

	void A ()
	{
		System.out.println("The method is used here");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Constr co =	new Constr();
	co.A();
		
	}
	
	Constr()
	{
		int i =20;
		System.out.println("The Constructor"+" "+i);
	}

}
