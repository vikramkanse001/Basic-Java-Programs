package K_Access_Specifier;

public class sample01 
{
	private int a;
	
	private sample01()
	{
		a=10;
		
	}
	private void squareOfNum()
	{
		System.out.println(a*a);
	}
	public static void main(String[] args)
	{
		sample01 a = new sample01();
		a.squareOfNum();
		System.out.println(a.a);
		
	}

}
