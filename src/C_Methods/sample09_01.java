package C_Methods;

public class sample09_01 
{
	public static void main(String[] args) 
	{
		addition(10,20);
		addition(20,30);
		addition(30,40);
		addition(40,50);
		System.out.println("-----------------");
		
		sample09_01 a = new sample09_01 ();
		a.mul(10,20);
		
		
	}
	public static void addition( int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void mul( int a , int b)
	{
		System.out.println(a*b);
	}

}
