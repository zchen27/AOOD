
public class ParametricGrapherTester2 extends ParametricGrapher
{
	@Override
	public double tInterval()
	{
		return 0.05 * Math.PI;
	}

	@Override
	public double tStart()
	{
		return 0;
	}

	@Override
	public double tEnd()
	{
		return 2.0 * Math.PI;
	}

	@Override
	public double xValue(double t)
	{
		return 2.0 * Math.cos(t);
	}

	@Override
	public double yValue(double t)
	{
		return 0.5 * Math.sin(t);
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
	
	private static void runParametricGrapherTester2()
	{
		XYGrapher GrapherTester = new  ParametricGrapherTester2();
		GrapherTester.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runParametricGrapherTester2();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
	
}
