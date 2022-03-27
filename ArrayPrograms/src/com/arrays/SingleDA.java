package com.arrays;

public class SingleDA 
{
	public static void main(String[] args)
	{

		//single dimensional array in one line initialization and declaration
		int amount[]= {100,200,300,400,500};

		for(int i=0;i<amount.length;i++)
		{
			System.out.println(amount[i]);

		}
		System.out.println("*******************");


		//single dimensional array in multiple line initialization and declaration
		int rupees[]= new int[5];
		rupees[0]=100;
		rupees[1]=200;   
		rupees[2]=300;
		rupees[3]=400;
		rupees[4]=500;
		for(int i=0;i<rupees.length;i++)
		{
			System.out.println(rupees[i]);

		}

	}

}
