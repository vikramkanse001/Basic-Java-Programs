package J_THis_Super;

public class sample02 extends sample01
{

	int a=10;
	
	public void m1()
	{
		int a=200;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
