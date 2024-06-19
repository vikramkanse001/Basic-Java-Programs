import java.util.Arrays;

public class example05 
{

	public static void main(String[] args) 
	{
		int []ar = new int[5];
		
		ar[0]=100;
		ar[1]=400;
		ar[2]=200;
		ar[3]=300;
		
		System.out.println(ar[0]);
		Arrays.sort(ar);
		
		System.out.println("------print array in ascending array--------");
		for( int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("-------print array in descending order---------");
		for( int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
	}
	


}
