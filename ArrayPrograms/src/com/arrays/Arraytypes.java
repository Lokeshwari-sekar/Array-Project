package com.arrays;

public class Arraytypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single dimensional array in one line initialization and declaration
		int amount[]= {100,200,300,400,500};
		//printing the studentMarks 
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
		System.out.println("*******************");
		//multidimensional array in one line initialization and declaration
		int mat[][]= {{1,1},{1,4}};

		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[i][j]+"\t");
				System.out.print("\n\n");
			}
		}

		System.out.println("*******************");
		//multidimensional array in multiple line declaration
		int matric[][]= new int[2][2];//object creation

		//multiple line initialization
		matric[0][0]=1;
		matric[0][1]=0;
		matric[1][0]=0;
		matric[1][1]=1;


		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(matric[i][j]+"\t");

			}
			System.out.print("\n\n\n");
		}

		System.out.println("*******************");


	}

}
