import java.util.Scanner;
//import java.lang.Math.*;
class Convert
{
	public static void main(String[] args)
	{
		String x,r="";
		double y = 0;
		
		System.out.print("Enter A number : ");
		Scanner s = new Scanner(System.in);
		//System.out.println("Binary is " + Integer.toBinaryString(n)); 
		x = s.nextLine();
		for(int i = x.length() - 1; i >= 0; i--)
        {
            r = r + x.charAt(i);
        }
		//System.out.print(x.charAt(0));
		for(int i = 0 ; i < r.length() ; i++)
		{
			if (r.charAt(i) == '1')
				y = Math.pow(2,i) + y;
			
		}
		System.out.print("num = " + (int)y);
	
		
	}
}