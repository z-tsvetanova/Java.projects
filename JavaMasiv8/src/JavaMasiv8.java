import java.util.Scanner;

public class JavaMasiv8 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("n:");
		int n=scanner.nextInt();
		int [] Years = new int[n];
		for(int i = 0 ; i<Years.length;i++)
		{
			Years[i]=scanner.nextInt();
		}
		for(int i = 0 ; i<Years.length;i++)
		{    
			System.out.println(isLeap.isLeap(Years[i]));
			try
			{
				if(Years[i]/1000>1 && Years[i]/1000<=9)
				{
					System.out.println("Godinata e chetiricifrena");
				}
				else
				{
					throw new YearException("Godinata ne e chetiricifrena");
					
				}
			}
			catch(YearException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

