package D_Control_Statement;

public class D02_nestedIf 
{
	public static void main(String[] args) 
	{
		int PEM=300;
		if( PEM>=310)
		{
			System.out.println("Eligible for mains exam");
			int MEM=640;
			if ( MEM>=660)
			{
				System.out.println("Got Selected");
			}
			else
			{
				System.out.println("rejected");
			}
		}
		else
		{
			System.out.println("Not Eligible for mains exam");
		}
		
	}

}
