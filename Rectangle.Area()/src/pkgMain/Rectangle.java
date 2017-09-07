package pkgMain;

public class Rectangle {
	

	private double Length;
	private double Width;
	public Rectangle(double length, double width) {
		Length = 5;
		Width = 3;
	}
	public double getLength() {
		return Length;
	}
	public double getWidth() {
		return Width;
	}
	
	public double Area()
	{
		// TODO Implement Area() function with the correct formula
		return Length * Width;
	}
}