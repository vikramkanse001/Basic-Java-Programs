package K_Access_Specifier;

public class sample06 
{
	protected int a;
	
	protected sample06()
	{
		a=30;
	}
	protected void squareofnumber()
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) 
	{
		sample06 e = new sample06();
		e.squareofnumber();
	
		System.out.println(e.a);
		
	}

}
