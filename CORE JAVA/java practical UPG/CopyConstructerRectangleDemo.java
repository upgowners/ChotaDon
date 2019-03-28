class Rectangle
{
	int length,breadth,area;
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
	Rectangle area(Rectangle r1)
	{
		area = r1.breadth*r1.length;
		return r1;
	}
	void display()
	{
		System.out.println("area of rectangle is" + area);
	}
}
class CopyConstructerRectangleDemo
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(4,3);
		Rectangle r1 = new Rectangle(r);
		//System.out.println("Area of Rectangle r1: " +r1.display());
		//System.out.println("Area of Rectangle r: " + r.display());
		System.out.println(r.area(r1));
		System.out.println("r obj");
		r1.area(r);
		r1.display();
	    r.display();
	}
}
/*

class Rect
{
	int l,w,area;
	Rect(int x, int y)
	{
		l=x;
		w=y;
	}
	Rect calculate(Rect obj)
	{
		area=l*w;
		return obj;
	}
	void display()
	{
		System.out.println("area of rectangle is" + area);
	}
}
class ReturnObj
{
	public static void main(String args[])
	{
		Rect obj1=new Rect(5,6);
		Rect obj2=obj1.calculate(obj1);
		obj2.display();
	}
}

*/