class CLW
{
	public static void main(String[] args)
	{
		String a = "Coza";
		String b = "Loza";
		String c = "Woza";
		
		for(int i = 1; i <= 110; i++)
		{
			while((i % 11) != 0){ 
				if((i % 11) != 0)
					System.out.println();
				if((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0))
					System.out.print((a + b + c) + " ");
				else if((i % 3 == 0) && (i % 5 == 0))
					System.out.print((a + b) + " ");
				else if((i % 5 == 0) && (i % 7 == 0))
					System.out.print((b + c) + " ");
				else if((i % 3 == 0) && (i % 7 == 0))
					System.out.print((a + c) + " ");
				else if((i % 3) == 0)
					System.out.print(a + " ");
				else if((i % 5) == 0)
					System.out.print(b + " ");
				else if((i % 7) == 0)
					System.out.print(c + " ");
				else
					System.out.print(" " + i + " ");
				i++;
					
		}
		System.out.println();
		}
	}
}