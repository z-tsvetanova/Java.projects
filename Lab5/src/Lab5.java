
public class Lab5 {

	public static void main(String[] args) 
	{
		Point [] point = { new Point(10,5), new Point(3,2), new Point(1,4), new Point(5,6), new Point(7,3)};
		Polygon polygon = new Polygon(point);
		System.out.println(polygon.CalculatePerimeter());
		Rectangle rectangle1= new Rectangle();
		rectangle1.getInfo();
		
	}

}
