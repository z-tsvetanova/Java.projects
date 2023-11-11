import java.util.Scanner;

public class Proekt6 {

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
        int sum = 0;
        while(number1 > 0) {
            sum += number1 % 10;
            number1 /= 10;
        }
        System.out.println(sum);
		    
	}
}
