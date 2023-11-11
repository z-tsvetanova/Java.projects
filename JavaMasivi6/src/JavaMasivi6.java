
public class JavaMasivi6 {

	public static void main(String[] args) 
	{  
		//1.Да се напише програма, която създава масив с 20 елемента от целочислен тип и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5. Елементите на масива да се изведат на конзолата.  	
		int [] Matrix = new int [20];
		for(int i = 0;i<Matrix.length;i++)
		{
			  Matrix[i]=i*5;
		}
		for(int i = 0;i<Matrix.length;i++)
		{
			 System.out.println(Matrix[i]);
		}
	}
}
