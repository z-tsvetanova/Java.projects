import java.util.InputMismatchException;
import java.util.Scanner;
public class Rectangle extends Shape implements InterfaceShape
{
  private String name;
  private double perimeter;
  private double area;
  private Point [] point1;
  public Rectangle()
  {
	  name="";
	  perimeter=0.0;
	  area=0.0;
  }
  public Rectangle(String name,double perimeter,double area)
  {
	  this.name=name;
	  this.perimeter=perimeter;
	  this.area=area;
  }
  public Rectangle(Point [] point1)
  {
	  this.point1=point1;
  }
  @Override 
  public double CalculateArea()
  {   
	  double a=ShapeUnit.GetDistance(point1[0],point1[1]);
	  double b=ShapeUnit.GetDistance(point1[2],point1[1]);
	  return a*b;
	  
  }
  @Override
  public double CalculatePerimeter()
  {
	    double a=ShapeUnit.GetDistance(point1[0],point1[1]);
	    double b=ShapeUnit.GetDistance(point1[2],point1[1]);
	    return (a+b)*2;
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
	System.out.println("This is Rectangle:");
}
@Override
public void getInfo()
{
	Scanner scanner = new Scanner(System.in);
	//name=scanner.next();
	//perimeter=scanner.nextDouble();
	//area=scanner.nextDouble();
	try
	{
		name=scanner.next();
		perimeter=scanner.nextDouble();
		area=scanner.nextDouble();
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	catch(InputMismatchException e)
	{
		System.out.println(e.getMessage());
	}
	
}

}

