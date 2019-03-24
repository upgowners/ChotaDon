class Shape
{
	double length, breadth, height;
	Shape (double length, double breadth, double height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
}

class Box extends Shape
{
	Box(double length, double breadth, double height)
	{
		super(length,breadth,height);
		System.out.println("Length is: " + length);
		System.out.println("Breadth is: " + breadth);
		System.out.println("Height is: " + height);
	}
	double volume()
	{
		return (length * breadth * height);
	}
}

class InheritanceDemo
{
	public static void main(String[] args)
	{
		Box b = new Box(2,4,3);
		System.out.println("Volume is: " + b.volume());
	}
}