package S_String;

public class sample05 
{
	public static void main(String[] args) 
	{
		String s1= "My name is rahul";
		String []ar = s1.split(" ");
		
		System.out.println(ar[3]);
		
		System.out.println(ar.length);
		
		System.out.println("-----------");
		
		System.out.println(s1.replace("rahul", "Ganesh"));
		
		for( int i=0; i<ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
