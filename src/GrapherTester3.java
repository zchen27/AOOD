
public class GrapherTester3 extends XYGrapher
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
				return new Coordinate(-0.5, 0.867, true, true);
			case 2:
				return new Coordinate(-0.5, -0.867, true, true);
			case 3:
				return new Coordinate(1, 0, false, true);
			case 4:
				return new Coordinate(0, 0.5, true, false);
			case 5:
				return new Coordinate(-0.433, -0.25, true, true);
			case 6:
				return new Coordinate(0.443, -0.25, true, true);
			case 7:
				return new Coordinate(0, 0.5, false, true);
			default:
				return null;
		}
	}
	
	private static void runGrapherTester3()
	{
		GrapherTester3 grapherTester3 = new GrapherTester3();	
		grapherTester3.drawGraph(0, 0, 750, 750);
	}
	
	public static void main(String[] s)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runGrapherTester3();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}

}
