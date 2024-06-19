package H_Constructor;

public class sample03 
{
	int num1;
	int num2;
	
	sample03()
	{
		num1=10;
		num2=20;
	}
	public void addition()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		sample03 q = new sample03( );
		q.addition();
		q.mul();
		
		sample04 w = new sample04();
		w.sub();
		
	}

}
