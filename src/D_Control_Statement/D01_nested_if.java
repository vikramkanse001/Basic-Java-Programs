package D_Control_Statement;

public class D01_nested_if
{
	public static void main(String[] args)
	{
		int PEM=100;
		if(PEM>=900)
		{
			System.out.println("Eligible for mains exam");
			
			int MEM=640;
			if(MEM>=650)
			{
				System.out.println("Got selected");
			}
			else
			{
				System.out.println("Got rejected");
			}
			
		}
		else
		{
			System.out.println("Not Eligible for mains exam");
		}
		
	}

}
