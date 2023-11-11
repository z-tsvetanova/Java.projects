import java.util.Random;
public class Main {

	public static void main(String[] args) throws Exception
	{
		 double [] mA= new double [10000];
		 Random random = new Random();
		 for(int i=0;i<mA.length;i++)
		 {
			 mA[i]=random.nextDouble();
		 }
	}
	public boolean method(String ime)
	{
		if(ime.length()%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}    
}

