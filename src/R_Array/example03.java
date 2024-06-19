package R_Array;

public class example03
{
	public static void main(String[] args)
	{
		char []ar = new char[4];
		
		ar[0]='A';
		ar[1]='B';
		ar[2]='C';
		ar[3]='D';
		
		System.out.println(ar[1]);
		System.out.println(ar.length);
		System.out.println("--------print all array------");
		
		for( int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		                     
		
	}

}
