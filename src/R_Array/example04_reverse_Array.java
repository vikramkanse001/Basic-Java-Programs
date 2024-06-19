package R_Array;

public class example04_reverse_Array
{
	public static void main(String[] args) 
	{
		int []ar = new int[5];
		ar[0]=101;
		ar[1]=102;
		ar[2]=103;
		ar[3]=104;
		ar[4]=105;
		
	//	System.out.println();
		System.out.println(ar.length);
		System.out.println("---------print all Array---------");
		for( int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---Revrse Array--------");
		for( int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
	}

}
