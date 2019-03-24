class SumOfDigit
{
	public static void main(String[] args)
	{
		String s = "123456789";
		int sum = 0;
		for(int i = 0 ; i < s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)) == true)
				sum = sum + Character.getNumericValue(s.charAt(i));
		}
		System.out.println(sum);
	}
}