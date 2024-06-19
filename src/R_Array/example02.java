package R_Array;

public class example02 
{
	public static void main(String[] args)
	{
		String []ar = new String[4];
		ar[0]="Mahesh";
		ar[1]="Ramesh";
		ar[2]="Arti";
		ar[3]="Wenkat";
		
		System.out.println(ar[0]);
		System.out.println(ar.length);
		System.out.println("-------Print all data ------------");
		
		for( int i=1 ; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
