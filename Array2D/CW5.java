
package Array2D;

public class CW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={
				   {22,31,9},
				   {12,5,16},  
				   {34,42,2},
				   {13,52,32}
				};
		
		
		for(int j=0;j<3;j++)		//for min of column
		{
			int min=a[0][j];
			
			for(int i=0;i<4;i++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			//	System.out.println(min);
				
			}
		System.out.println(min);
		}
		
	}

}