
public class FunctionGrapherTester2 extends FunctionGrapher
{
	@Override
	public double xIncrement()
	{
		return 0.1;
	}

	@Override
	public double yValue(double xValue)
	{
		return Math.cos(xValue);
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(0, -1);
	}

	@Override
	public double xRange()
	{
		return 20;
	}

	@Override
	public double yRange()
	{
		return 2;
	}
	
	private static void runFunctionGrapherTester2()
	{
		FunctionGrapher functionGrapherTester = new FunctionGrapherTester2();
		functionGrapherTester.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runFunctionGrapherTester2();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
