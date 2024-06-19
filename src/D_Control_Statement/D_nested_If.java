package D_Control_Statement;

public class D_nested_If
{
	public static void main(String[] args) 
	{
		int PEM  =320;
		if( PEM >=302)
		{
			System.out.println("eligibe for mains exam");
			int MEM=640;
			if( MEM>=650)
			{
				System.out.println("Got selected");
			}
			else
			{
				System.out.println("Got rejected");
			}
			
			
		}
		
	}

}
