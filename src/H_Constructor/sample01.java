package H_Constructor;

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
		sample01 s = new sample01();
		s.m1();
		s.m2();
		
		System.out.println("------------------");
		
		 sample02 d = new  sample02();
		 d.m3();
		
	}

}
