package D_Control_Statement;

public class E_nestedIf 
{
	public static void main(String[] args) 
	{
		int SA=120;
		if(SA>=130)
		{
			System.out.println("Additional 10% discount");
			
			if (SA>=10000)
			{
				System.out.println("Additonal 10%Discount on sale");
			}
			else
			{
				System.out.println("No Additinal 10% Discount");
			}
		}
		else
		{
			System.out.println("No Additional discount");
		}
		
	}

}
