import java.util.Scanner;

public class Circle extends Shape implements InterfaceShape
{

	 private String name;
	 private double perimeter;
	 private double area;
	 private Point [] point2;
	 public Circle()
	  {
		  name="";
		  perimeter=0.0;
		  area=0.0;
	  }
	  public Circle (String name,double perimeter,double area)
	  {
		  this.name=name;
		  this.perimeter=perimeter;
		  this.area=area;
	  }
	  public Circle(Point [] point2)
	  {
		  this.point2=point2;
	  }
	  @Override 
	  public double CalculateArea()
	  {
		  double r=ShapeUnit.GetDistance(point2[0], point2[1]);
		   return Math.PI*r*r;
	  }
	  @Override
	  public double CalculatePerimeter()
	  {
		   double r=ShapeUnit.GetDistance(point2[0], point2[1]);
		   return Math.PI*r*r;
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
			System.out.println("This is Circle:");
			
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
