
public class GrapherTester2 extends XYGrapher
{

	@Override
	public Coordinate xyStart()
	{
		return new Coordinate(2, 2);
	}

	@Override
	public double xRange()
	{
		return 4;
	}

	@Override
	public double yRange()
	{
		return 4;
	}

	@Override
	public Coordinate getPoint(int pointNum)
	{
		switch(pointNum)
		{
			case 0:
				return new Coordinate(1, 0, true, false);
			case 1:
				return new Coordinate(-0.809, 0.587, true, true);
			case 2:
				return new Coordinate(0.309, -0.951, true, true);
			case 3:
				return new Coordinate(0.309, 0.951, true, true);
			case 4:
				return new Coordinate(-0.809, -0.587, true, true);
			case 5:
				return new Coordinate(1, 0, false, true);
			default:
				return null;
		}
	}
	
	private static void runGrapherTester2()
	{
		GrapherTester2 grapherTester2 = new GrapherTester2();	
		grapherTester2.drawGraph(100, 0, 750, 750);
	}
	
	public static void main(String[] s)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runGrapherTester2();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
