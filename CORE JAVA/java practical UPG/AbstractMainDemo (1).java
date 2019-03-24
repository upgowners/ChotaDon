abstract class Shape
{
	public abstract double area();
}

class Circle extends Shape
{
	int radius;
	final double PI = 3.14;
	Circle(int radius)
	{
		this.radius = radius;
	}
	public double area()
	{
		return (PI * radius * radius);
	}
}

class Rectangle extends Shape
{
	int length, breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double area()
	{
		return (length * breadth);
	}
}

class MainDemo
{
	public static void main(String[] args)
	{
		Shape S;
		S = new Rectangle(3,4);
		System.out.println("Area Of Rectangle is: " + S.area());
		S = new Circle(1);
		System.out.println("Area Of Circle is: " + S.area());
	}
}