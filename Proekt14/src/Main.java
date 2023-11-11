import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		 // Method method= new Method();
		  //int [] ma= new int [4];

		 // method.elements( ma);
		
		//int [] a = {2,3,4,5,6};
		//int n = a.length;
		//System.out.println(n>4);
		MyThread Mythread1= new MyThread();
		Mythread1.start();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n);
		 
	}
 public static void OutPut() throws InterruptedException
 {
	 for(int i=10;i>=1;i--)
	 {   
		
		 System.out.println(i + " Metod output ");
		 Thread.sleep(2000);
	 }
 }

}

