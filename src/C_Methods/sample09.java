package C_Methods;
// method with paramentr.
public class sample09 
{
	public static void main(String[] args) 
	{
		addition( 10, 20);
		addition(20,30);
		addition(30,40);
		
		System.out.println("----------");

		
	
		
		sample09 a = new sample09 ();
		a.mul(2, 50);
		
		
		
	}

	public static void addition( int a , int b)
	{
		System.out.println(a+b);
	}
	public void mul(int a , int b)
	{
		System.out.println(a*b);
	}
	

}
