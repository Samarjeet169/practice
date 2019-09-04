package array;
import java.util.Scanner;
public class basic {
Scanner in = new Scanner(System.in);
public static   int x[];
public static int y[];
public static int r[];
	public int [] accept()
	{
		System.out.println("Enter the size of array");
		int size=in.nextInt();
	     x =new int [size];
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Enter the elements");
			x[i]=in.nextInt();
		}
		return x;
	}
	
	
	public void display()
	{
		System.out.println("Array elements are");
		for(int i=0;i<=x.length-1;i++)
		{
			
			System.out.println(x[i]+ " ");
		}
	
	}
	
	public void add()
	{
		System.out.println("Array elements are");
		 int sum=0;
		for(int i=0;i<=x.length-1;i++)
		{ 
			sum=sum+x[i];	
		}
		System.out.println(sum);
	
	}


	public void reverse( )
	{
		for (int i=x.length-1;i>=0;i--)
		{    System.out.println(x[i]);
		}		
		
	
		
	}
	
	public void displayrev()
	{
		System.out.println("Array elements are");
		for(int i=0;i<=r.length-1;i++)
		{
			
			System.out.println(y[i]+ " ");
		}
	
	}
	
	
}




