
public class Plane extends Vehicle
{
  private String name;
  private int numberofSeats;
  public Plane(String name,int numberofSeats,String type)
  {
	  super(type);
	  this.name=name;
	  this.numberofSeats=numberofSeats;
	  
  }
  
}
