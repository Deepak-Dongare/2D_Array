package Array2D;
import java.util.Scanner;



	class SumMatrix {
		int row=2;
		int col=2;
		
		int c[][] = new int[row][col];

		void sum(int a[][], int b[][]) {
				for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			disp();
		}
		void disp()
		{
			for (int i = 0; i < row; i++)
				for (int j = 0; j < col; j++)
					System.out.print(c[i][j] + " ");
			System.out.println();
			
		}

	}

	 class Cw88 {

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
			 x = sc.nextInt();
			y = sc.nextInt();

			int b[][] = new int[x][y];

			System.out.println("Enter the element in second array");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					b[i][j] = sc.nextInt();
				}
			}

			SumMatrix s = new SumMatrix();
			s.sum(a, b);
		//	 s.disp();

		}

	


}
