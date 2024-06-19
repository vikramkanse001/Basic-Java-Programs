package G_Constructor;

public class sample03
{
	int num3;
	int num4;
	
	sample03()
	{
		num3=10;
		num4=20;
	}
	public void addition()
	{
		System.out.println(num3+num4);
	}
	public void mul()
	{
		System.out.println(num3*num4);
	}
	
	public static void main(String[] args)
    {
		
		sample03 s3 = new sample03();
		s3.addition();
		s3.mul();
		
		System.out.println("----");
		
		sample04 s = new sample04 ();
		s.sub();
		
		
	}

}
