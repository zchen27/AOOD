
public class XYTesterFinal extends XYGrapher
{
	
	private static void runXYTesterFinal()
	{
		XYTesterFinal grapherTester = new XYTesterFinal();	
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
				return new Coordinate(3, 0, true, false);
			case 1:
				return new Coordinate(0, 3, false, true);
			default:
				return null;
	
		}
	}
}
