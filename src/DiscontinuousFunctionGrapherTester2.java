
public class DiscontinuousFunctionGrapherTester2 extends DiscontinuousFunctionGrapher
{
	@Override
	public boolean exclude(double xValue)
	{
		if(xValue == 0)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public double xIncrement()
	{
		return 0.2;
	}

	@Override
	public double yValue(double xValue)
	{
		return 1 / xValue;
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(-3, -3);
	}

	@Override
	public double xRange()
	{
		return 6;
	}

	@Override
	public double yRange()
	{
		return 6;
	}
		
	private static void runDiscontinuousFunctionGrapherTester2()
	{
		FunctionGrapher functionGrapherTester = new  DiscontinuousFunctionGrapherTester2();
		functionGrapherTester.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runDiscontinuousFunctionGrapherTester2();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
	
}
