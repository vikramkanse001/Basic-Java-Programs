package P_Generalisation;

public class testClass
{
	public static void main(String[] args) 
	{
		Jio a = new Jio();
		a.sms();
		a.AudioCalling();
		a.Data();
		a.newFeatureA();
		System.out.println("-------Airtel---------");
		
		Airtel b = new Airtel();
		b.sms();
		b.AudioCalling();
		b.Data();
		b.NewFeatureB();
		System.out.println("----------Vi----------");
		
		
		 Vi c = new  Vi();
		 c.sms();
		 c.AudioCalling();
		 c.Data();
		 c.NewFeatureC();
		 
		
	}

}
