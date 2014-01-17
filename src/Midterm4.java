
public class Midterm4 extends ParametricGrapher
{
	@Override
	public double tInterval()
	{
		return 0.1;
	}

	@Override
	public double tStart()
	{
		return 0;
	}

	@Override
	public double tEnd()
	{
		return 20;
	}

	@Override
	public double xValue(double t)
	{
		return t * Math.sin(t);
	}

	@Override
	public double yValue(double t)
	{
		return t * Math.cos(t);
	}

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(-20, -20);
	}

	@Override
	public double xRange()
	{
		return 40;
	}

	@Override
	public double yRange()
	{
		return 40;
	}
	
	private static void runMidterm()
	{
		XYGrapher grapher = new Midterm4();
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
