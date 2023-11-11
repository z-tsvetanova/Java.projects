import java.util.Random;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m=n/2;
		int [] Matrix = new int[n];
		Random random = new Random();		
		if(n%2==0)
		{
			for( int i=0;i<Matrix.length;i++)
			{
				Matrix[i]=random.nextInt(n);
				
			}
			for(int i=0;i<Matrix.length;i++) //Preminavane na vsichki elementi v masiv
			{
				if(Matrix[i]==m)//Proverka dali dadenata stoinost e ravna na n  //Matrix[i] stoinost na konkretniq indeks  // i nomera na indeksa 					
				{
					System.out.println(i);
				}
			}
							
		}
		
	}
}
