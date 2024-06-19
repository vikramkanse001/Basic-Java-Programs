package I_Inheritance;

public class b_Hierarchicla 
{
	public static void main(String[] args) 
	{
		System.out.println("----------son1--------");
		son01 a = new son01();
		a.car();
		a.Money();
		a.Home();
		a.bike();
		System.out.println("-------son02--------");
		
		son02 b = new son02();
		b.car();
		b.Money();
		b.Home();
		b.mobile();
		System.out.println("-------son3--------");
		
		son03 c = new son03();
		c.car();
		c.Money();
		c.Home();
		c.laptop();
		
	}

}
