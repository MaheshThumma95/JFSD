import java.util.Scanner;

public class JaggedArray2D {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
		
		int [][] ar=new int[3][]; 
		ar[0]= new int[4];
		ar[1] = new int [2];
		ar[2] = new int [3];

		
		
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				System.out.println("Enter marks of class "+i +" Student "+j);
				ar[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("The marks of students are");
		
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
			
		}
	}
}
/*
Output:
Enter marks of class 0 Student 0

50
Enter marks of class 0 Student 1
60
Enter marks of class 0 Student 2
70
Enter marks of class 0 Student 3
80
Enter marks of class 1 Student 0
25
Enter marks of class 1 Student 1
35
Enter marks of class 2 Student 0
45
Enter marks of class 2 Student 1
90
Enter marks of class 2 Student 2
88


The marks of students are
50 60 70 80 
25 35 
45 90 88 
 */