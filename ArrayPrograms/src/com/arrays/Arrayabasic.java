package com.arrays;

public class Arrayabasic 
{

	public static void main(String[] args)
	{
		//array declaration and initialization
		int studentIds[]= {100,101,102,104};
	    char studentInitial[]= {'T','J','V','S','S'};
		String studentNames[]= {"abi","kiru","mani","gangu","ravi","loki"};
		double studentMarks[]= {88.56,78.92,69.08,67.90,59.80,78.60};
		int amount[][]= {{1,8},{2,9},{3,7}};
		System.out.println("the amount is");
		System.out.println(amount.length);
		//finding the length of the array
		
		System.out.println(studentIds.length);
		System.out.println(studentInitial.length);
		System.out.println(studentNames.length);
		System.out.println(studentMarks.length);
		System.out.println("*******************");
		
		//printing the studentIds 
		for(int i=0;i<studentIds.length;i++)
		{
			System.out.println(studentIds[i]);
		}
		System.out.println("*******************");
		
		
		//printing the studentInitials 
		for(int i=0;i<studentInitial.length;i++)
		{
			System.out.println(studentInitial[i]);
		}
		System.out.println("*******************");
		
		
		//printing the studentNames 
		for(int i=0;i<studentNames.length;i++)
		{
			System.out.println(studentNames[i]);
		}
		System.out.println("*******************");
		
		
		
		//printing the studentMarks 
		for(int i=0;i<studentMarks.length;i++)
		{
			System.out.println(studentMarks[i]);
		
		}
		System.out.println("*******************");
		
		System.out.println(amount[1][1]);
		

		
		
		
	}

}
