import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args)
    {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a character:");
		
		
		String input = s.nextLine().toLowerCase();
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int index = (alphabets.indexOf(input));
		
		
        System.out.println("Printing the pattern :");
        for (int i = 0; i <= index; i++)
        {
            int alphabet = 65;
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}