
public class PolynomialGrapherTester2 extends PolynomialGrapher
{

	@Override
	public double[] coefficients()
	{
		double[] coefficients = {1, -3, -4, 12};
		return coefficients;
	}

	@Override
	public double xIncrement()
	{
		return 0.1;
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(-4, -2);
	}

	@Override
	public double xRange()
	{
		return 8;
	}

	@Override
	public double yRange()
	{
		return 16;
	}
	
	private static void runPolynomialGrapherTester()
	{
		XYGrapher grapher = new PolynomialGrapherTester2();
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
