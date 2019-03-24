import java.util.Scanner;
class Matrix
{
	public static void main(String[] args)
	{
		int m1[][] = new int[2][2];
		int m2[][] = new int[2][2];
		int m3[][] = new int[2][2];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements of first matrix: ");
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				m1[i][j] = s.nextInt();
			}	
		}
		System.out.println("First matrix is: ");
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				System.out.print(m1[i][j] + " ");
			}	
			System.out.println();
		}
		System.out.println("Enter elements of second matrix: ");
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				m2[i][j] = s.nextInt();
			}	
		}
		System.out.println("Second matrix is: ");
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				System.out.print(m2[i][j] + " ");
			}	
			System.out.println();
		}
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				m3[i][j] = m1[i][j] + m2[i][j];
			}	
		}
		System.out.println("Addition of matrix is: ");
		for(int i = 0; i <= 1; i++)
		{
			for(int j = 0; j <= 1; j++)
			{
				System.out.print(m3[i][j] + " ");
			}	
			System.out.println();
		}
	}
}                                                           