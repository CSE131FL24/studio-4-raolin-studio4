package studio4;

import java.awt.Color;
import java.awt.Font;


import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.setPenColor(65, 50, 125);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.25);

		for (double i = 0.40; i < 0.60; i=i+0.09) {
			StdDraw.setPenColor(Color.white);
			StdDraw.filledRectangle(0.5, i, 0.45, 0.01);

		}

		StdDraw.setPenColor(243, 145, 31);
		StdDraw.filledRectangle(0, 0.5, 0.1, 0.25);

		Font font = new Font("Arial", Font.BOLD, 40);
		StdDraw.setFont(font);
		StdDraw.text(0.5, 0.65, "eclipsedom");
		Font font2 = new Font("Arial", Font.BOLD, 30);
		StdDraw.setFont(font2);
		StdDraw.text(0.5, 0.315, "//code. debug. push.//");

	}
}