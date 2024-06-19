package K_Access_Specifier;

public class sample03 
{
	int a;
	
	sample03()
	{
		a=20;
	}
	void squareOfNum()
	{
		System.out.println(a*a);
	}
	
	public static void main(String[] args)
	{
		sample03 s3 = new sample03();
		s3.squareOfNum();
		
		System.out.println(s3.a);
		
		
	}

}
