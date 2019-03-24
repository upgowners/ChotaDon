import java.util.Scanner;
class EH
{
	public void exceptDemo()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = s.nextInt();
		System.out.println("Enter second number: ");
		int b = s.nextInt();
		try
		{
			int c = a/b;
			System.out.println("Division is: " + c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Zero Division Error occured");
		}
	}
}
class EHDemo
{
	public static void main(String[] args)
	{
		EH e = new EH();
		e.exceptDemo();
	}
}