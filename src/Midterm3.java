
public class Midterm3 extends FunctionGrapher
{
	@Override
	public double xIncrement()
	{
		return 0.1;
	}

	@Override
	public double yValue(double xValue)
	{
		return 5 * Math.sin(xValue) * Math.sin(6 *xValue);
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(0, -6);
	}

	@Override
	public double xRange()
	{
		return 12;
	}

	@Override
	public double yRange()
	{
		return 12;
	}
	
	private static void runMidterm()
	{
		XYGrapher grapher = new Midterm3();
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
