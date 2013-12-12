
public abstract class FunctionGrapher extends XYGrapher
{
	public abstract double xIncrement();
	
	public abstract double yValue();
	
	public double xValue(int pointNum)
	{
		return pointNum * xIncrement();
	}
	
	@Override
	public Coordinate getPoint(int pointNum)
	{
		return null;
	}
}
