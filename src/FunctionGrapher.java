
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
		double y;
		double xStart = xyStart().getX();
		System.out.println(x);
		if((x >= xStart + xRange()) && (x - xIncrement() <= xStart + xRange()))
		{
			x = xStart + xRange();
		}
		else
		{
			System.out.println("null");
			return null;
		}
		
		y = yValue(x);
		
		return new Coordinate(x, y, true, true);
	}
}
