class FindLargestAndSmallestElement
{
	public static void main(String[] args)
	{
		int[] arr = {6,20,0,4444,12,44444,1,1,7,344444};
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length ; i++)
		{
			
				if(arr[i] > max)
					max = arr[i];
				if(arr[i] < min)
					min = arr[i];
			
		}
		System.out.println("Largest value : " + max);
		System.out.println("Smallest Value : " + min);
	}
}