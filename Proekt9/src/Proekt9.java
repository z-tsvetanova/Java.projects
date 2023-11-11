import java.util.Scanner;

public class Proekt9 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double tejest = scanner.nextDouble();
		double gravitaciqLuna = tejest*17/100;
		double TejestNaLunata = tejest-gravitaciqLuna;
		System.out.println(TejestNaLunata);				
	}

}
