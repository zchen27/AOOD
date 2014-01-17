
public class Midterm1 extends PolynomialGrapher
{
	@Override
	public double[] coefficients()
	{
		double[] coefficients = {2, -5, 3};
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
		return new Coordinate(0, -1);
	}

	@Override
	public double xRange()
	{
		return 2.0;
	}

	@Override
	public double yRange()
	{
		return 5.0;
	}
	
	private static void runMidterm()
	{
		XYGrapher grapher = new Midterm1();
		grapher.drawGraph(0, 0, 500, 500);
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runMidterm();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
	
}
