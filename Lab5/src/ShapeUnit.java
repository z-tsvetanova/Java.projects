
public class ShapeUnit
{
  public static double GetDistance(Point Point1, Point Point2)
  {
	  double a= Point2.Getx()-Point1.Getx();
	  double b= Point2.Gety()-Point1.Gety();
	  double c= Math.sqrt(a*a+b*b);
	  return c;
  }
  
}
