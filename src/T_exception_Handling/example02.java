package T_exception_Handling;

public class example02 
{
	public static void main(String[] args)
	{
		String s1 = "abcd";
		try
		{
			System.out.println(s1.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception handlled");
		}
		System.out.println("GM");
		
	}

}
