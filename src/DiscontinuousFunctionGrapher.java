
public abstract class DiscontinuousFunctionGrapher extends FunctionGrapher
{
	public boolean exclude(double xValue)
	{
		return false;
	}
	
	@Override
	public Coordinate getPoint(int pointNum)
	{
		double x = xValue(pointNum);
		if(exclude(x))
		{
			return new Coordinate(0, 0, false, false);
		}
		else
		{
			return super.getPoint(pointNum);
		}
	}
}
