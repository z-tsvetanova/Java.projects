
public class Circle extends Figure
{
  private double r;
  public Circle()
  {
	  r=0;
  }
  public Circle(double r)
  {
	  this.r=r;
  }
  @Override 
  public double area()
  {
	  double s=Math.PI*r*r;
	  return s;
  }
  
}
