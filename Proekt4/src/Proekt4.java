import java.util.Scanner;

public class Proekt4 {

	public static void main(String[] args)
	{  
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n==1)
		{
			System.out.println("Kvadrat");
			int a = scanner.nextInt();
			int S = a*a;
			System.out.println(S);
		}
		else if(n==2)
		{
			System.out.println("Pravougulnik");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int S = a*b;
			System.out.println(S);
		}
		else if(n==3)
		{
			System.out.println("Radius");
			double r =scanner.nextDouble();
			double S = Math.PI*r*r;
			System.out.println(S);
			
		}
		else if(n==4)
		{
			System.out.println("Triugulnik");
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			double S= (a + b + c)/2;
			System.out.println(S);
		}	
       
}
	
}
