package R_Array;

public class example01_03 
{
	public static void main(String[] args)
	{
		int []ar = new int [5];
		
		ar[0]=101;
		ar[1]=102;
		ar[2]=103;
		ar[3]=104;
		ar[4]=105;
		
		System.out.println(ar.length);
		System.out.println(ar[1]);
		System.out.println("-------print all data-------");
		
		for( int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}

}
