
public class ParametricGrapherTester extends ParametricGrapher
{
	@Override
	public double tInterval()
	{
		return 0.05 * Math.PI;
	}

	@Override
	public double tStart()
	{
		return Math.PI / 2.0;
	}

	@Override
	public double tEnd()
	{
		return Math.PI * (3.0 / 2.0);
	}

	@Override
	public double xValue(double t)
	{
		return Math.cos(t);
	}

	@Override
	public double yValue(double t)
	{
		return Math.sin(t);
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(-1, -1);
	}

	@Override
	public double xRange()
	{
		return 2;
	}

	@Override
	public double yRange()
	{
		return 2;
	}
	
	private static void runParametricGrapherTester()
	{
		XYGrapher GrapherTester = new  ParametricGrapherTester();
		GrapherTester.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runParametricGrapherTester();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
	
}
