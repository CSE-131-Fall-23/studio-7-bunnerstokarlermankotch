package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private int length;
	private int width;
	
	
	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}
	
	public int Perimeter() {
		return (2 * this.length) + (2 * this.width);
	}
	
	public int Area() {
		return (this.length * this.width);
	}
	
	// Getter:
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	
	
	// Setter:
	public void setLength(int newLength) {
		this.length = newLength;
	}
	
	public void setWidth(int newWidth) {
		this.width = newWidth;
	}
	
	
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle (3, 5);
		
		System.out.println("Perimeter = " + rec1.Perimeter());
		System.out.println("Area = " + rec1.Area());
		
		
		rec1.setLength(10);
		rec1.setWidth(6);

		System.out.println(" ");
		
		System.out.println(rec1.Perimeter());
		System.out.println(rec1.Area());
	}
}