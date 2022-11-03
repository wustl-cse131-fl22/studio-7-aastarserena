package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

/**
 * 
 * @author starrothkopf
 * @variable length
 * @variable width
 */

public class Rectangle {
	
	// instance variable
	private int length;
	private int width;
	
	public Rectangle(int initLength, int initWidth) { // constuctor 
	      length = initLength;
	      width = initWidth;
	   }

	public double area() { 
	     return length * width;
	   }
	
	public double perimeter() {
		return length * 2 + width * 2;
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public boolean isSmaller(Rectangle r) {
		return (this.area() < r.area());
	}
	
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(4, 5);
		Rectangle rect2 = new Rectangle(6, 10);
		
		if (rect1.isSmaller(rect2)) {
			System.out.println("Rectangle 1 is smaller than Rectangle 2");
		}
		
	}

}
