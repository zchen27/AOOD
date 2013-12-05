
public class Coordinate
{
	private double abscissa;
	private double ordinate;
	private boolean drawFrom;
	private boolean drawTo;
	
	public Coordinate(double x, double y)
	{
		abscissa = x;
		ordinate = y;
	}
	
	public Coordinate(double x, double y, boolean df, boolean dt)
	{
		abscissa = x;
		ordinate = y;
		drawFrom = df;
		drawTo = dt;
	}
	
	public double getX()
	{
		return abscissa;
	}
	
	public double getY()
	{
		return ordinate;
	}
	
	public boolean drawFrom()
	{
		return drawFrom;
	}
	
	public boolean drawTo()
	{
		return drawTo;
	}
}
