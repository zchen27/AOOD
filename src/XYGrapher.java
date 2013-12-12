import java.awt.*;
import java.util.*;
import javax.swing.*;

public abstract class XYGrapher
{
	private ArrayList<Coordinate> coordinates;
	int xStart;
	int yStart;
	int width;
	int height;
	
	public class GraphPanel extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponents(g);
			g.setColor(Color.green);
			g.drawLine(xStart, yStart + height / 2, xStart + width, yStart + height / 2);
			g.drawLine(xStart + width / 2, yStart, xStart + width / 2, yStart + height);
			
			g.setColor(Color.black);
			for(int i = 0; i < coordinates.size() - 1; i++)
			{
				Coordinate prev = coordinates.get(i);
				Coordinate next = coordinates.get(i + 1);
								
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
		
		double X0 = xyStart().getX();
		double Y0 = xyStart().getX();
		
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
			
			int centerX = (int) (xPixelStart + pixelsWide / 2);
			int centerY = (int) (yPixelStart + pixelsHigh / 2);
			
			int deltaX = (int) (X1 * (pixelsWide / xRange()));
			int deltaY = (int) (Y1 * (pixelsHigh / yRange()));
			
			int X = centerX + deltaX;
			int Y = centerY + deltaY;
			mapped.add(new Coordinate(X, Y, df, dt));
		}
		
		coordinates = mapped;
		
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
