package J_THis_Super;

public class A02 extends A01
{
	int a=100;
	
	public void m1()
	{
		int a=200;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	

}
