package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(1.0, 1.0, 1.0, 1.0); 
		
		StdDraw.setPenColor(Color.BLUE); 
		StdDraw.filledRectangle(0.0, 1.0, 0.4, 0.4); 
		
		Color yellow = new Color (255, 255, 0); 
		StdDraw.setPenColor(yellow); 
		StdDraw.setPenRadius(0.2); 
		StdDraw.point(0.2,0.8);
	}
}