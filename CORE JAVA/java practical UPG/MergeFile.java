import java.io.*;

class MergeFile
{
	public static void main(String[] args)
	{
		try{
		FileWriter txt3 = new FileWriter("txt3.txt",true);
		FileInputStream fin = new FileInputStream("txt1.txt");
		FileInputStream fin1 = new FileInputStream("txt2.txt");
		int b = 0;
		while((b = fin.read()) != -1)
		{
			txt3.write((char)b);
		}
		b = 0;
		while((b = fin1.read()) != -1)
		{
			txt3.write(b);
		}
		txt3.close();
		fin.close();
		fin1.close();
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		
	}
}