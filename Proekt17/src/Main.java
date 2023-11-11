import java.util.Random;

public class Main {

	public static void main(String[] args) 
	{
		    /*double [] MA = new double[10000];
		    Random random = new Random();
		    for(int i=0;i<MA.length;i++)
		    {
		    	MA[i]=random.nextDouble();
		    	System.out.println(MA[i]);
		    }
		    */
		  //boolean proverka=method("duma");
		 // ilovemethod(10);
		 
		String [] televizor = Televizor.Interface('b');
		for(int i=0;i<televizor.length;i++)
		{
			System.out.println(televizor[i]);
		}
		
		Televizor televizor1= new Televizor();
		int result = televizor1.numero(4);
		
		Televizor Televizor [] = new Televizor [10];
		
		
	}
  public static boolean method(String duma)
  {
	  if(duma.length()%2==0)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  public static void ilovemethod(int number)
  {
	  System.out.println("I love java");
	  System.out.println(number);
  }
}
