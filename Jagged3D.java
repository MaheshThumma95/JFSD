package com.example.arrays;

import java.util.Scanner;

public class Jagged3D{

		public static void main(String[] args)
		{
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter Number of colleges avaialbe?");
		  int collges  = scan.nextInt();
		  System.out.println("Enter number of classes avaialable in you college");
		  int cls  = scan.nextInt();
		  System.out.println("Enter number of students available in the each class");
		  int marks = scan.nextInt(); 
		  int [][][] hyder=new int[collges][cls][marks];
		  
		  for(int i=0;i<hyder.length;i++)
		  {
			  for(int j=0; j<hyder[i].length;j++)
			  {
				  for(int k=0;k<hyder[i][j].length;k++)
				  {
					  System.out.println("Enter marks of College "+ i+ " Class "+ j + " Student "+k);
					  hyder[i][j][k]=scan.nextInt();
				  }
			  }
		  }
		  System.out.println("Marks stored are as follows");
		  for(int i=0;i<hyder.length;i++)
		  {
			  for(int j=0; j<hyder[i].length;j++)
			  {
				  for(int k=0;k<hyder[i][j].length;k++)
				  {
					  System.out.print(hyder[i][j][k] +" ");
				  }
				  System.out.println();
			  }
		  }

		}

	}
