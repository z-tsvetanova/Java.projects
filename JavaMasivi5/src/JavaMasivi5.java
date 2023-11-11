import java.util.Random;
import java.util.Scanner;

public class JavaMasivi5 {

	public static void main(String[] args)
	{  
		//Напишете Java конзолно приложение, което създава масив от N на брой случайни цели числа в диапазона [0, N], където N е четно число. Напишете програмния код, чрез който на конзолата се разпечатва позицията на всички числа със стойност М=N/2. 
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = n/2;
		int [] randomchisla = new int [n];
		for(int i = 0;i<randomchisla.length;i++)
		{
			randomchisla[i] = random.nextInt(n);
			System.out.print(randomchisla[i]+ " ");
		}
		for(int i = 0;i<randomchisla.length;i++)
		{
			if(randomchisla[i]==m)
			{
				System.out.println(i);
			}
		}
	}
}
