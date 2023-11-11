import java.util.Scanner;

public class JavaMasivi3 {

	public static void main(String[] args)
	{ 
		//Напишете Java  конзолно приложение ,което създава масив от имената на месеците от годината.]
		//При подадено число да се изписва името на месеца на английски ,а при невалиден номер на месец да се изписва „Няма такъв месец“. 
		Scanner scanner = new Scanner(System.in);
		String [] Months = new String [] {"January",
	    "February",
	    "March",
	    "April",
	    "May",
	    "June",
	    "July",
	    "August",
	    "September",
	    "Octomber",
	    "November",
	    "December",};
		int a = scanner.nextInt();
		if(a>12)
		{
			System.out.println("Nqma takuv mesec");
		}
		else
		{
			System.out.println(Months[a-1]);
		}
		//for(int i = 0 ; i<Months.length; i++)
		//{
			//System.out.println (String.format("Months [%d] = %s", i, Months[i]));		
		//}
		//System.out.println();
		//for(int i = Months.length-1; i>=0 ;i--)
		//{
			 //System.out.println (String.format("Months [%d] = %s", i, Months[i]));
		//}		
		//System.out.println();
 
}

}


