import java.util.Scanner;
class Reverse1
{
	public static void main(String[] args)
	{
		String s,s1=" ";
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for(int i = (s.length()-1); i>=0; i--)
		{
			s1 = s1 + s.charAt(i);
			//System.out.print(s.charAt(i));
		}
		System.out.println("Reverse is: " + s1);	
	}
}