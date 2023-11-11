
public class Fibonacci
{
	public static long Fibonacci(int n)
	{
		if(n<1)
		{
		  return 0;
		}
		if(n<=2)
		{
			return 1;
		}
	  return Fibonacci(n-1)+(Fibonacci(n-2)); //Rekursiq funkciq koqto vika sebe si
		
	}
}
