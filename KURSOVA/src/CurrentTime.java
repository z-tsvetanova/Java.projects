import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentTime
{
   private LocalDateTime time;  
   private String hours;
   private DateTimeFormatter Formatter;
   public CurrentTime()
   {
	   time=LocalDateTime.now();   //Този код ще вземе сегашното време
       Formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS"); //Задава формат в часове и милисекунди
       hours=time.format(Formatter); 
   }
   public String getHours()  //Метод gethours чете стойността на полето
   {
	   return hours;
   }
   public synchronized void setHours() //Метод setHours записва стойността на полето
   {
	   time=LocalDateTime.now();  //Този код ще вземе сегашното време
	   hours=time.format(Formatter); //Форматира формат в часове и милисекунди
   }
}
