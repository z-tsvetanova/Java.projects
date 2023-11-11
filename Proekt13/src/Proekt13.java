import java.util.Scanner;

public class Proekt13 {

	public static void main(String[] args) 
	{
		
       Scanner scanner = new Scanner(System.in);
       double proizvedenie = 1;
       double chislo = scanner.nextDouble();
       if(chislo>0)
       {   
    	  
    	   proizvedenie=chislo*2;
    	   System.out.println("Result:");
    	   System.out.println(proizvedenie);
       }
       else
       {
    	   System.out.println("Negative result");
       }             
	}
}
