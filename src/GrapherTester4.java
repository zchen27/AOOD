
public class GrapherTester4 extends XYGrapher
{
	//First directional image: Arrow pointing towards pi/4
	@Override
	public Coordinate xyStart()
	{
		return(new Coordinate(3, 3));
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

	@Override
	public Coordinate getPoint(int pointNum)
	{
		switch(pointNum)
		{
			case 0:
				return new Coordinate(0, 0, true, false);
			case 1:
				return new Coordinate(3, 3, false, true);
			case 2:
				return new Coordinate(2, 1, true, false);
			case 3:
				return new Coordinate(3, 3, false, true);
			case 4:
				return new Coordinate(1, 2, true, false);
			case 5:
				return new Coordinate(3, 3, false, true);
			default:
				return null;
	
		}
	}
	
	private static void runXYTesterFinal()
	{
		GrapherTester4 grapherTester = new GrapherTester4();	
		grapherTester.drawGraph(0, 0, 750, 750);
	}
		
	public static void main(String[] s)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runXYTesterFinal();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
