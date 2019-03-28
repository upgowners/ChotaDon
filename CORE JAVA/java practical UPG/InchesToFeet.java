import java.util.Scanner;

class InchesToFeet
{
	int inputinches,inches;
	int feet;
	InchesToFeet()
	{
		inputinches = 0;
		feet = 0;
	}
	void getHeight()
	{
		Scanner s = new Scanner(System.in);
		inputinches = s.nextInt();
	}
	void ConvertInchesToFeet()
	{
		inches = inputinches % 12;
		feet = inputinches / 12;
		System.out.println("Feet and Inches : " + feet + " Feet " + inches + " Inches");
	}
	
	public static void main(String[] args)
	{
		InchesToFeet IF = new InchesToFeet();
		IF.getHeight();
		IF.ConvertInchesToFeet();
	}
}
