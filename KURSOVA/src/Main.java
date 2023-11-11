
public class Main {

	public static void main(String[] args) 
	{
		CurrentTime CurrentTime1=new CurrentTime(); //Създаване на обект от клас CurrentTime
		MyThread MyThread1=new MyThread(CurrentTime1, " Nishka1 "); //Създавам обект от клас MyThread създавам нишка и подавам като параметър обект от клас CurrentTime и String
		MyThread MyThread2=new MyThread(CurrentTime1, " Nishka2 ");
		MyThread1.start(); //С името на обекта и метод start стартираме нишката
		MyThread2.start();
	}
}
