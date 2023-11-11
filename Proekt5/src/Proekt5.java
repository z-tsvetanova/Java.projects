import java.util.Scanner;
public class Proekt5
{
	public static void main() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Broi Orhidei");
	int broiOrhidei = scanner.nextInt();
	System.out.println("Broi Zymbyul");
	int broiZymbyuli = scanner.nextInt();
	System.out.println("Broi Rozi");
	int broiRozi = scanner.nextInt();
	System.out.println("Broi Kaktusi");
	int broiKaktusi = scanner.nextInt();
	System.out.println("Broi Laleta");
	int broiLaleta = scanner.nextInt();
	double CenaNaOrhideq = 13.25;
	int CenaNaZymbyul = 5;
	double CenaNaRozi=8.50;
	int CenaNaKaktusi = 8;
	int CenaNaLaleta = 3;
	double Suma = 13.25*broiOrhidei+ 5*broiZymbyuli+8.50*broiRozi+8*broiKaktusi+3*broiLaleta;
	int CenaNaTelefon = scanner.nextInt();
	Suma += Suma*(7/100);
	if(Suma<CenaNaTelefon)
	{
		System.out.println("Parite sa stignali");
	}
	else
	{
		System.out.println("Parite ne sa stignali");
	}				
}
	
}
