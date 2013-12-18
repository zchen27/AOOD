
public class PolynomialGrapherTester3 extends PolynomialGrapher
{

	@Override
	public double[] coefficients()
	{
		double[] coefficients = {0.5, 0.5, 1, -1.3, -2.4, 0};
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
		return new Coordinate(-2.5, -2);
	}

	@Override
	public double xRange()
	{
		return 5;
	}

	@Override
	public double yRange()
	{
		return 5;
	}
	
	private static void runPolynomialGrapherTester()
	{
		XYGrapher grapher = new PolynomialGrapherTester3();
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
