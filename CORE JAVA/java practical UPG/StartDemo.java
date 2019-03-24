class SortData
{
	public int[] arr = new int[6];
	SortData()
	{
		arr ={6,20,0,4444,12,44444};
	}
	public void ascending()
	{
		for(int i = 0; i < 	arr.length ; i++)
		{
			for(int j = 0; j < arr.length ; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}
	public void descending()
	{
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0; j < arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public void display()
	{
		for(int i = 0; i < arr.length ; i++)
		{
				System.out.print(arr[i] + " ");
		}
	}
}
class StartDemo
{
	public static void main(String[] args)
	{
		SortData sd = new SortData();
		sd.ascending();
		System.out.print("Ascending : "); 
		sd.display();
		sd.descending();
		System.out.print("\nDescending : "); 
		sd.display();
		
	}
}