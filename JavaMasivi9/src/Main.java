
public class Main {

	public static void main(String[] args)
	{
		int [] masiv = {1,5,7,12,3,18};
		/*int j=2;
		for(int i=0;i<masiv.length;i++)
		{
		   masiv[i]=masiv[i]*j;
		   if(masiv[i]%2!=0)
		   {
			   masiv[i]=masiv[i]+5;
		   }
		}
		for(int i=masiv.length-1;i>=0;i--)
		{
			System.out.println(masiv[i]);
		}
        */
		
		int result = Unit.unit(masiv);
		Unit unit1 = new Unit();
		char result1=unit1.method("duma");
		
		unit1.pass("admin","123456");
	}

	
}

