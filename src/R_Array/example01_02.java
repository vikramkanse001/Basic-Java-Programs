package R_Array;

public class example01_02 
{
	public static void main(String[] args)
	{
		int [] ar = new int[5];
		
		ar[0]=101;
		ar[1]=102;
		ar[2]=103;
		ar[3]=104;
		ar[4]=105;
		
		System.out.println(ar[0]);
		System.out.println(ar.length);
		
		System.out.println("--------print all data ---------");
		for( int i=1; i<=ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
