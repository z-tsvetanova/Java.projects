
public class isLeap 
{
	public static boolean isLeap(int m)
	{
		if(m%4==0 && (m%400==0 || m%100!=0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
