class AreaCircle
{
	public static void main(String[] args)
	{
		double radius = Double.parseDouble(args[0]);
		double area,perimeter,pi=3.14;
		area = pi*radius*radius;
		System.out.println("Area Of Circle is: " + area);
		perimeter = 2*pi*radius;
		System.out.println("Area Of Perimeter is: " + perimeter);
		
	}
}