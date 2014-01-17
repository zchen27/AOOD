
public class Midterm2 extends FunctionGrapher
{
	@Override
	public double xIncrement()
	{
		return 0.1;
	}

	@Override
	public double yValue(double xValue)
	{
		return Math.log(xValue) / Math.log(2);
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(1, -2);
	}

	@Override
	public double xRange()
	{
		return 9;
	}

	@Override
	public double yRange()
	{
		return 7;
	}
	
	private static void runMidterm()
	{
		XYGrapher grapher = new Midterm2();
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
