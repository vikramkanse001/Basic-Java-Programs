package T_exception_Handling;

public class example05 
{
	public static void main(String[] args)
	{
		int []ar = new int [4];
		
		try 
		{
			ar[5]=10;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("HI");
		
	}

}
