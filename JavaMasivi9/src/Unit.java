
public class Unit
{  
   private String password="123456";
   public void pass(String username,String password)
   {   
	   
	   if(username=="admin"&&this.password==password)
	   {
		   System.out.println("You are admin");
	   }
	   else
	   {
		   System.out.println("You are not admin");
	   }
	 
   }
  
   
 
   
   public static int unit(int [] masiv)
   {
	   return masiv.length;
   }
   public char method(String neshto)
   {
	   char duma=neshto.charAt(0);
	   return duma;
   }
   
   
   
   public  static class UnitChild
   {
	   
   }
}
