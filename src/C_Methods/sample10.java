package C_Methods;

public class sample10 
{
	public static void main(String[] args)
	{
		
		studentname("Anujs");
		studentname("Vikram");
		studentname("Rahul");



		sample10 a = new sample10 ();
		a.studentname("Vikram"+" "+ "kanse");
		
		
		
		sample10_A.studentinfo("vikram", 101, 58.5f);
	}
	public static void studentname(String s1)
	{
		System.out.println(s1);
	}
	
	public void studentname( String fname, String lname)
	{
		System.out.println(fname+lname);
	}
	
	

}
