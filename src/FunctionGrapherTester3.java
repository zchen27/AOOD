
public class FunctionGrapherTester3 extends FunctionGrapher
{
	@Override
	public double xIncrement()
	{
		return 0.1;
	}

	@Override
	public double yValue(double xValue)
	{
		double y = 0;
		for(int k = 0; k < (int) xValue / xIncrement(); k++)
		{
			
		}
		return 0;
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
	
	private static void runFunctionGrapherTester3()
	{
		FunctionGrapher functionGrapherTester = new FunctionGrapherTester3();
		functionGrapherTester.drawGraph(0, 500, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runFunctionGrapherTester3();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
