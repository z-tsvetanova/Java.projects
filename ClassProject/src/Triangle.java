
public class Triangle extends Figure
{
   private double a,b,c;
   public Triangle()
   {
	   a = 0;
	   b = 0;
	   c = 0;
   }
   public Triangle(double a,double b,double c)
   {
	  this.a=a;
	  this.b=b;
	  this.c=c;
   }
   @Override
   public double area()
   {	   
	   double p = (a+b+c)/2;
	   double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	   return s;	  
   } 
   
}
