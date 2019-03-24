import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String [] args)
	{
		System.out.println("Enter any decimal number: ");
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		String x="";
		int count=0,a;
		while(n>0)							  // 6%2=0    count=0  x=0      n=6/2=3
													 // 3%2=1    count=1  x=10     n=3/2=1
													// 1%2=1    count=2  x=110    n=1/2=0
		{										
			a=n%2;
			if(a==1)
			{
				count++;
			}
			x=a+x;
			n=n/2;
		}
		System.out.println("Binary number: "+x);
		System.out.println("The number of 1's: "+count);
	}
}