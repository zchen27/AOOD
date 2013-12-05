import java.awt.*;
import java.util.*;
import javax.swing.*;

public abstract class XYGrapher
{
	public class graphPanel extends JPanel
	{
		public graphPanel(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh, ArrayList<Coordinate> points)
		{
			super();
			
		}
	}
	
	public abstract Coordinate xyStart();
	public abstract double xRange();
	public abstract double yRange();
	public abstract Coordinate getPoint(int pointNum);
	public void drawGraph(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh)
	{
		int i = 0;
		Coordinate prev = null;
		Coordinate next = getPoint(i);
		ArrayList<Coordinate> points = new ArrayList();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(next != null)
		{
			i++;
		}
	}
}
