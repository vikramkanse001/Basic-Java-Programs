package R_Array;
// decalaration ++ initialisation in a single step.
public class example06 
{
	public static void main(String[] args) 
	{
		int []ar = {100, 200,300,400,500};
		System.out.println(ar[2]);
		System.out.println(ar.length);
		System.out.println("-------print all data from array------");
		for( int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
