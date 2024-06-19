package T_exception_Handling;

public class example01 
{
	public static void main(String[] args)
	{
		int []ar = new int [4];
		try
		{
			ar[4]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exceptin handled");
		}
		System.out.println("Hello");
		
	}
	

}
