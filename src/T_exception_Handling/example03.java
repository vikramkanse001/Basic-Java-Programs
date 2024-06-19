package T_exception_Handling;

public class example03 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int div =30;
		try 
		{
			div = a/b;
			
		} 
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
		}
		System.out.println("Hi");
	
	}

}
