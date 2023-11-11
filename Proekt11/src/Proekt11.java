import java.util.Scanner;

public class Proekt11 {

	public static void main(String[] args) 
	{
		
       Scanner scanner = new Scanner(System.in);
       int a = 1;
       int sum = 0;
       while(a!=0)     
       {
    	   a = scanner.nextInt();
    	   if(a>0)
    	   {
    		   sum += a;
    		   System.out.println("Chisloto e polojitelno");
    	   }
    	   else
    	   {
    		   System.out.println("Chisloto ne e polojitelno");
    	   }
       }
       
               System.out.println(sum);
	}
}
