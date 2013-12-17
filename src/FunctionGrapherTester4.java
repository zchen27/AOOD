
public class FunctionGrapherTester4 extends FunctionGrapher
{
	@Override
	public double xIncrement()
	{
		return 0.1;
	}

	@Override
	public double yValue(double xValue)
	{
		return Math.cos(xValue) * Math.sin(10 * xValue);
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(-10, -10);
	}

	@Override
	public double xRange()
	{
		return 20;
	}

	@Override
	public double yRange()
	{
		return 20;
	}
	
	private static void runFunctionGrapherTester4()
	{
		FunctionGrapher functionGrapherTester = new FunctionGrapherTester4();
		functionGrapherTester.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runFunctionGrapherTester4();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
