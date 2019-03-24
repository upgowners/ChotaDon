class SquareRoot
{
	public static void main(String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double root,square;
		root = Math.sqrt(a);
		System.out.println("Square Root is: " + root);
		square = Math.pow(a,2);
		System.out.println("Square is: " + square);
		
	}	
}