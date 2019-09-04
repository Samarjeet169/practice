package array;

import java.util.Scanner;

public class twod {
	
	static int z=0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x[] [];
		
		System.out.println("Enter the array sizer");
		int sizer=in.nextInt();
		System.out.println("Enter the array sizec");
		int sizec=in.nextInt();
		x=new int[sizer][sizec];
		System.out.println("Enter the elements3");
		for (int i=0;i<sizer;i++)
		{for (int j=0;j<sizec;j++)
		{
			x[i][j]=in.nextInt();
		    
		}}
		
		System.out.println("display elements ");
		for (int i=0;i<sizer;i++)
		{
		for (int j=0;j<sizec;j++)
		{
				System.out.print(x[i][j]);
				System.out.print("\t");
		}System.out.println();}
		
		System.out.println("Addition of  elements ");
		for (int i=0;i<sizer;i++)
		{
		for (int j=0;j<sizec;j++)
		{      
		z=z+x[i][j];
				
				
		}
		System.out.print(z);
		
	}
	

}
}