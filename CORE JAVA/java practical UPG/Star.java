class Star
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		for(int i = a; i >= 1; i = i-2)
		{
			
			for(int j = i ; j >= 1; j--)
			{
				System.out.print("*");
				
			}
			
			System.out.println("");
			for(int z = a; z >= i;z = z-2)
			{
				System.out.print(" ");
				
			}
		}
	}
}
