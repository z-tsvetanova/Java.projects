
public class Pointx
{
  private double x,y;
  public Pointx()
  {
	  x=0;
	  y=0;
  }
  public Pointx(double x,double y)
  {
	  this.x=x;
	  this.y=y;
  }
  public double GetDistance(Pointx x1, Pointx y2) //Kogato davame parametri ot obekt dostupvame poletata
  {  
	  double a = y2.x-x1.x;
	  double b = y2.y-x1.y;
	  double c = a*a+b*b;
	  c=Math.sqrt(c);
	  return c;
  }
 public double  GetAreaRectangle(Pointx [] Point)
 {  
	 double a = GetDistance(Point[0],Point [1]);
	 double b = GetDistance(Point [1],Point [2]);
	 return a*b;
 }
 public double GetAreaCircle(Pointx [] Point)
 {
	 double radius = GetDistance(Point[0],Point[1]);
	 return Math.PI*radius*radius;
 }
 public double GetAreaTrapezoid(Pointx [] Point)
 {
	  double a = GetDistance(Point[0],Point [1]);
	  double b = GetDistance(Point [0],Point[Point.length-1]);
	  double c=(a-b)/2;
	  double h= a*a-c*c;
	  h=Math.sqrt(h);
	  return h*(a+b)/2;
 }
 public double GetAreaCube(Pointx [] Point)
 {
	 double a = GetDistance(Point [0],Point[Point.length-1]);
	 double b = GetDistance(Point [Point.length-1],Point[Point.length-2]);
	 double c = GetDistance(Point [Point.length-3],Point[Point.length-3]);
	 return 2*c*(a+b);
 }
}
