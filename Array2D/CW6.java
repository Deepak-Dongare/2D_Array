package Array2D;

import java.util.Scanner;

public class CW6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.println("enter no. of rows:");
		row=sc.nextInt();
		System.out.println("enter no. of col:");
		col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("enter elements :");
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<row;i++)		//for max of row
		{
			int max=a[0][0];
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println(max);
	}
		

	}

}
