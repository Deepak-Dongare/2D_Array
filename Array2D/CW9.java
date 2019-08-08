package Array2D;

import java.util.Scanner;

public class CW9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int a =sc.nextInt();
		
		System.out.println("enter elements:");
		int b[] =new int[a];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<(b.length-1);j++)
			{
				if(b[j]<0)
				{
					int t = 0 ;
					b[j]=b[j+1];
					b[j+1]=t;
				}
			}
		}
			for(int k=0;k<b.length;k++)
			{
				System.out.print(b[k]+"\t");
			}
	}

	

}