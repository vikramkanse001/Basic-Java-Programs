package G_Constructor;

public class sample01
{
	public void m1()
	{
		System.out.println("Running method m1");
	}
	public void m2()
	{
		System.out.println("Running method m2");
	}
	public static void main(String[] args)
	{
		
		sample01 a = new sample01();
		a.m1();
		a.m2();
		
		System.out.println("-----------------------");
		
		
		sample01 b = new sample01();
		b.m2();
		
		
	}
	

}
