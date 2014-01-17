
public class Midterm5 extends DiscontinuousFunctionGrapher
{
	@Override
	public double xIncrement()
	{
		return 0.1;
	}

	@Override
	public double yValue(double xValue)
	{
		return 1 / ((xValue - 1) * (xValue + 1));
	}
	
	@Override
	public boolean exclude(double xValue)
	{
		if(xValue == -1 || xValue == 1)
		{
			return true;
		}
		return false;
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(-5, -5);
	}

	@Override
	public double xRange()
	{
		return 10;
	}

	@Override
	public double yRange()
	{
		return 10;
	}
	
	private static void runMidterm()
	{
		XYGrapher grapher = new Midterm5();
		grapher.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runMidterm();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
	
}
