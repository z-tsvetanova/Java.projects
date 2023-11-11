
public class MyThread extends Thread  
{  
   private CurrentTime CurrentTime; //Поле обект от тип CurrentTime която служи за споделен ресурс
   public MyThread(CurrentTime CurrentTime,String name) //Подавам параметър обект от тип CurrentTime, и параметър name който ни дава името на нишката
   {   super(name);  //Super вика конструктор на базовия клас като конструктора от клас thread приема един параметър името на нишката
	   this.CurrentTime=CurrentTime; //Инициализация на полето
   }
   public void run()  //Метод който описва нишката
   {  
	   while(true)// Безкраен цикъл
	   {
		   System.out.println(CurrentTime.getHours() + getName()); //Обект от тип Currentime достъпваме метода getHours + метод getName който взима името на нишката с която работим
		   try {
			sleep(1000);  // Метод sleep привежда нишката в неработно състояние
		} catch (InterruptedException e) //Обработване на грешка
		   {
			
			e.printStackTrace();
		}
		  CurrentTime.setHours(); //Обект от тип CurrentTime променяме полето и го записва
	   }
   }
} 


