import java.awt.*;
import java.util.*;
import javax.swing.*;

public abstract class XYGrapher
{
	private ArrayList<Coordinate> pixelCoordinates;
	private int xStart;
	private int yStart;
	private int width;
	private int height;
	private int startX;
	private int startY;
	int oX;
	int oY;
	
	public class GraphPanel extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			
			super.paintComponents(g);

			g.setColor(Color.green);
			g.drawLine(xStart, oY, (xStart + width), oY);
			g.drawLine(oX, yStart, oX, (yStart + height));
			
			g.setColor(Color.black);
			for(int i = 0; i < pixelCoordinates.size() - 1; i++)
			{
				Coordinate prev = pixelCoordinates.get(i);
				Coordinate next = pixelCoordinates.get(i + 1);
								
				if(prev.drawFrom() && next.drawTo())
				{
					g.drawLine((int) prev.getX(), (int) prev.getY(), (int) next.getX(), (int) next.getY());
				}
			}
		}
	}
	
	public abstract Coordinate xyStart();
	
	public abstract double xRange();
	
	public abstract double yRange();
	
	public abstract Coordinate getPoint(int pointNum);
	
	public void drawGraph(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh)
	{
		int i = 0;
		
		xStart = xPixelStart;
		yStart = yPixelStart;
		width = pixelsWide;
		height = pixelsHigh;
		
		startX = (int) xyStart().getX();
		startY = (int) xyStart().getY();
		
		int dOriginX = (int) ((0 - startX) * (width / xRange()));
		int dOriginY = (int) ((0 - startY) * (height / yRange()));
		oX = xStart + dOriginX;
		oY = yStart + dOriginY;
		
		ArrayList<Coordinate> points = new ArrayList(0);
		ArrayList<Coordinate> mapped = new ArrayList(0);
		
		while(getPoint(i) != null)
		{
			points.add(getPoint(i));
			i++;
		}
		
		for(int j = 0; j < points.size(); j++)
		{
			double X1 = points.get(j).getX();
			double Y1 = points.get(j).getY();
			
			boolean df = points.get(j).drawFrom();
			boolean dt = points.get(j).drawTo();
			
			int deltaX = (int) (X1 * (pixelsWide / xRange()));
			int deltaY = (int) (Y1 * (pixelsHigh / yRange()));
			
			
			int X = oX + deltaX;
			int Y = oY - deltaY;
			mapped.add(new Coordinate(X, Y, df, dt));
		}
		
		pixelCoordinates = mapped;
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(0, 1));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JPanel graph = new GraphPanel();
		graph.setLayout(new GridLayout(0, 1));
		frame.setContentPane(graph);
		frame.pack();
		frame.setVisible(true);
	}
}
