
public class GrapherTester extends XYGrapher
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
				return new Coordinate(-1, -1, true, false);
			case 1:
				return new Coordinate(1, -1, true, true);
			case 2:
				return new Coordinate(1, 1, true, true);
			case 3:
				return new Coordinate(-1, 1, true, true);
			case 4:
				return new Coordinate(-1, -1, false, true);
			default:
				return null;
		}
	}
	
	private static void runGrapherTester()
	{
		GrapherTester grapherTester = new GrapherTester();	
		grapherTester.drawGraph(0, 0, 750, 750);
	}
	
	public static void main(String[] s)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runGrapherTester();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
