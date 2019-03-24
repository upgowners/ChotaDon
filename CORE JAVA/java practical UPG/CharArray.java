import java.util.Scanner;
class CharArray
{
	public static void main(String[] args)
	{
		String s;
		int space_count = 0, a = 0, b = 0;
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.print("The string entered is :  " + s + "\n");
		char[] ch = s.toCharArray();
		int i = 0;
		while (i != ch.length)
		{
			if (Character.isDigit(ch[i]))
				a++;
			else if(Character.isSpaceChar(ch[i]))
				space_count++;
			else if(Character.isLetter(ch[i]))
				b++;
			else
				System.out.println("Others");
			i++;
		}
		System.out.println("Number of spaces: " + space_count);
		System.out.println("Number of digits: " + a);
		System.out.println("Number of letters: " + b);
	}
}