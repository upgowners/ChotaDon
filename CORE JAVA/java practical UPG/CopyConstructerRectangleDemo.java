class Rectangle
{
	int length,breadth;
	Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	Rectangle(Rectangle r1)
	{
		this.length = r1.length;
		this.breadth = r1.breadth ;
	}
	int area(Rectangle r1)
	{
		return (r1.length * r1.breadth);
	}
}
class RectangleDemo
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(4,3);
		Rectangle r1 = new Rectangle(r);
		System.out.println("Area of Rectangle r1: " + r1.area(r));
		System.out.println("Area of Rectangle r: " + r.area(r));
	}
}