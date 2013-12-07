
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
				return new Coordinate(-1, -1, true, false);
			default:
				return null;
		}
	}
	
}
