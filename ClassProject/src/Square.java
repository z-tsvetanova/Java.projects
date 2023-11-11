
public class Square extends Figure
{
    private double a;
    public Square()
    {
    	a=0;
    }
    public Square(double a)
    {
    	this.a=a;
    }
    @Override
    public double area()
    {
    	double s=a*a;
    	return s;
    }
 
}
