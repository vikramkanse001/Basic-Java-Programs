package G_Constructor;

public class sample05
{
	int num1;
	int num2;
	

	sample05( int a , int b)
	{
		num1= a;
		num2 = b;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	
	public static void main(String[] args)
	{
		sample05 s5 = new sample05(10, 20);
		s5.add();
		s5.sub();
		
	}




}
