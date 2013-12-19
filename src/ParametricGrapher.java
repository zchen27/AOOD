
public abstract class ParametricGrapher extends XYGrapher
{
	public abstract double tInterval();
	
	public abstract double tStart();
	
	public abstract double tEnd();
	
	public abstract double xValue(double t);

	public abstract double yValue(double t);

	public double tValue(int pointNum)
	{
		return pointNum * tInterval() + tStart();
	}
	
	@Override
	public Coordinate getPoint(int pointNum)
	{
		double t = tValue(pointNum);
		
		if(t > tEnd())
		{
			return null;
		}
		else if((t >= tEnd()) && (t - tInterval() <= tEnd()))
		{
			t = tEnd();
		}
		else
		{

		}
		
		double x = xValue(t);
		double y = yValue(t);
		
		return new Coordinate(x, y, true, true);
	}
}
