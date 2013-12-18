
public class PolynomialGrapherTester extends PolynomialGrapher
{
	@Override
	public double[] coefficients()
	{
		double[] coefficients = {4.8, -1.2, 0.2};
		return coefficients;
	}

	@Override
	public double xIncrement()
	{
		return 0.2;
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(0, 0);
	}

	@Override
	public double xRange()
	{
		return 6;
	}

	@Override
	public double yRange()
	{
		return 10;
	}
	
	private static void runPolynomialGrapherTester()
	{
		XYGrapher grapher = new PolynomialGrapherTester();
		grapher.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runPolynomialGrapherTester();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
