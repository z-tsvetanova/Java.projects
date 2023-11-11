import java.util.Scanner;

public class JavaMasivi1 {

	public static void main(String[] args)
	{   
		//Напишете Java конзолно приложение, което създава едномерен масив от 10 елемента.
		//Да се отпечата в прав и обратен ред.
		//Да се модифицира програмния код от задача 4 така че ,да се изведе най-малката и най-голямата стойност в масива. 
		Scanner scanner = new Scanner(System.in);
		int [] Matrix = new int [10];
		int min=1000000000;
		int max=-1000000000;
		for(int i = 0 ; i<Matrix.length;i++)
			
		{
			Matrix [i] = scanner.nextInt();
		}
		System.out.println();
		for(int i = 0 ;i < Matrix.length;i++)
		{   
			if(min>Matrix[i])
			{
				min=Matrix[i];
			}
		    System.out.println (String.format("Matrix [%d] = %d", i, Matrix [i]));
		}
		System.out.println();
		for(int i = Matrix.length-1; i>=0;i--)
		{    
			if(max<Matrix[i])
			{
				max=Matrix[i];
			}
			 System.out.println (String.format("Matrix [%d] = %d", i, Matrix [i]));
		}	System.out.println(min);
		    System.out.println(max);
		
	}
}
