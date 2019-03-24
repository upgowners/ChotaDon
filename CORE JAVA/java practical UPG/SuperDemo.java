class Rectangle
{
	int length, breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public int area()
	{
		return (length * breadth);
	}
}

class Box extends Rectangle
{
	int height;
	Box(int length, int breadth, int height)
	{
		super(length, breadth);
		this.height = height;
		System.out.println("Length is: " + length);
		System.out.println("Breadth is: " + breadth);
		System.out.println("Height is: " + height);
	}
	public int area()
	{
		System.out.println("Area Of Rectangle: " + super.area());
		return (super.area() * height);
	}
}

class Demo
{ 
	public static void main(String[] args)
	{
		Box b = new Box(2,3,4);
		System.out.println("Area Of Box is: " + b.area());
	}
}