
public class Point
{
  private double x;
  private double y;
  public Point()
  {
	  x=0;
	  y=0;
  }
  public Point(double x,double y)
  {
	  this.x=x;
	  this.y=y;
  }
  public double Getx() //metod Getx vzimame stoinostta na poleto, zashtoto e private
  {
	  return x;
  }
  public double Gety()
  {
	  return y;
  }
  public void Setx(double x) //metod Gety oromenqme stoinostta na poleto, zashtoto e private
  {
	   this.x=x;
  }
  public void Sety(double y)
  {
	   this.y=y;
  }

}
