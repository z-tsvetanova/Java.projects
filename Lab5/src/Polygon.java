import java.util.Scanner;

public class Polygon extends Shape implements InterfaceShape
{
	 private String name;
	 private double perimeter;
	 private double area;
	 private Point [] point;
	 public Polygon()
	  {
		  name="";
		  perimeter=0.0;
		  area=0.0;
	  }
	  public Polygon(String name,double perimeter,double area)
	  {
		  this.name=name;
		  this.perimeter=perimeter;
		  this.area=area;
	  }
	  public Polygon(Point [] Point1)
	  {
		    point=Point1;
	  }
	  @Override 
	  public double CalculateArea()
	  {
		  return 0;
	  }
	  @Override
	  public double CalculatePerimeter()
	  {
		  double sum = 0;
		  for(int i=0;i<point.length-1;i++)
		  {
			  sum+=ShapeUnit.GetDistance(point[i],point[i+1]);
			 
		  }
		  return sum;
	  }
	@Override
	public String getName() 
	{
		return name;
		
	}
	@Override
	public void setName(String name) 
	{
		this.name=name;
		
	}
	@Override
	public double getPerimeter() 
	{
		return CalculatePerimeter();
	}
	@Override
	public double getArea()
	{
		return CalculateArea();
	}
	@Override
	public void showInfo() 
	{
		System.out.println("This is Polygon:");
		
	}
	@Override
	public void getInfo() 
	{
		Scanner scanner = new Scanner(System.in);
		name=scanner.next();
		perimeter=scanner.nextDouble();
		area=scanner.nextDouble();
	}
	
}
