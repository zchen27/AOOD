
public abstract class FunctionGrapher extends XYGrapher
{
	public abstract double xIncrement();
	
	public abstract double yValue(double xValue);
	
	public double xValue(int pointNum)
	{
		return pointNum * xIncrement() + xyStart().getX();
	}
	
	@Override
	public Coordinate getPoint(int pointNum)
	{
		double x = xValue(pointNum);
		double y = yValue(x);
		double xStart = xyStart().getX();
		
		if(x > (xStart + xRange()))
		{
			
		}
		else if((x >= xStart + xRange()) && (x - xIncrement() <= xStart + xRange()))
		{
			x = xStart + xRange();
		}
		else
		{

		}
		
		return new Coordinate(x, y, true, true);
	}
}
