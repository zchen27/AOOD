
public class DiscontinuousFunctionGrapherTester extends DiscontinuousFunctionGrapher
{
	@Override
	public boolean exclude(double xValue)
	{
		if(xValue == 1)
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
		return (Math.pow(xValue,2) - 1) / (xValue - 1);
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(0, 0);
	}

	@Override
	public double xRange()
	{
		return 3;
	}

	@Override
	public double yRange()
	{
		return 5;
	}
	
	private static void runDiscontinuousFunctionGrapherTester()
	{
		FunctionGrapher functionGrapherTester = new  DiscontinuousFunctionGrapherTester();
		functionGrapherTester.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runDiscontinuousFunctionGrapherTester();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
	
}
