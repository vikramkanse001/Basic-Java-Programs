package R_Array;

public class example01
{
	public static void main(String[] args)
	{
		int [] ar = new int[5];
		
		ar[0]= 101;
		ar[1]=102;
		ar[3]=103;
		ar[4]=104;
		
		
		System.out.println(ar[0]);
		System.out.println(ar.length);
		System.out.println("----------");
		for( int i=0; i<=4; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
