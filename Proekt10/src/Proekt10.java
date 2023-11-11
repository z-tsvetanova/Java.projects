import java.util.Scanner;

public class Proekt10 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int chislo = scanner.nextInt();
		int sum = 0;
		int i = 0;
		while(chislo>=1)
		{
			
			sum = sum+chislo%10;
			chislo = chislo/10;
			
		}
        System.out.println(sum);
	}

}
