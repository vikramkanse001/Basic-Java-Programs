package R_Array;

import java.util.Arrays;

public class example05
{
	public static void main(String[] args)
	{
		int [] ar = new int [5];
		ar[0]=100;
		ar[1]=400;
		ar[2]=300;
		ar[3]=200;
		ar[4]=500;
		
		System.out.println("--------Print original data--------");
		for( int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
			
		}
		Arrays.sort(ar);;
		System.out.println("------print arrays in ascending order---------");
		for( int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---------print array in descending order---------");
		for( int i=ar.length-1; i>=1; i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
	}

}
