import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String letter = scanner.next();
        System.out.println(Unit.numberOfLetter(text, letter.charAt(0)));

	}

}
