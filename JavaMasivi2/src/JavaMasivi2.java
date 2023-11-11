import java.util.Scanner;

public class JavaMasivi2 {

	public static void main(String[] args)
	{  
		//Да се напише Java конзолно приложение, което създава едномерен масив от N на брой елемента. 
		//Стойностите на масива да се въвеждат от потребителя. 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] mA = new int [n];
		for(int i = 0; i<mA.length; i++)
		{
			mA[i] = scanner.nextInt();
		}
		for(int i = 0; i<mA.length; i++)
		{
			System.out.println (String.format("mA [%d] = %d",i, mA[i]));
		}
	}
}
