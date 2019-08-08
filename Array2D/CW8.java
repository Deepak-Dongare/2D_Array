package Array2D;

import java.util.Scanner;

class Sum {
	int row=2;
	int col=2;
	int c[][] = new int[row][col];
	void sum(int a[][], int b[][] /*, int row, int col*/) {

		/*
		 * int row = 0; int col = 0;
		 */
	//	this.row = row;
		//this.col = col;

	//	int c[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}}
		}

	/*	for (int i = 0; i <row; i++)
			for (int j = 0; j < col; j++)
				System.out.print(c[i][j] + " ");
		System.out.println();
			//disp();
	}*/
	void disp()
	{
		for (int i = 0; i < row; i++)
			for (int j = 0; j <col; j++)
				System.out.print(c[i][j] + " ");
		System.out.println();
		
	}

}

public class CW8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int a[][] = new int[x][y];
		System.out.println("Enter the element in First array");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {

				a[i][j] = sc.nextInt();
				// System.out.println(a[i][j]);
			}
		}

		System.out.println("Enter the size of second array");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		int b[][] = new int[x1][y1];

		System.out.println("Enter the element in second array");
		for (int i = 0; i < x1; i++) {
			for (int j = 0; j < y1; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		Sum s = new Sum();
		s.sum(a, b/*,x,y*/);
	  s.disp();

	}

}
