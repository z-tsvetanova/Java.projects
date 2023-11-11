import java.util.Scanner;

public class JavaMasivi7 {

	public static void main(String[] args) 
	{   
		//2. Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви. 
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int [] Matrix = new int[a];
		int [] Matrix1 = new int[a];
		int counter=0;
		for(int i=0;i<Matrix.length;i++)
		{
			Matrix[i]=scanner.nextInt();
		}
		for(int i=0;i<Matrix1.length;i++)
		{
			Matrix1[i]=scanner.nextInt();
		}		
		for(int i=0;i<Matrix.length;i++)
		{
			if(Matrix[i]==Matrix1[i])
			{
				counter++;
			}
		}
		if(counter==Matrix.length)
		{
			System.out.println("Masivite sa ednakvi");
		}
	}		
}
