import java.io.*;
import java.util.Scanner;

class FileDemo
{
	public static void main(String[] args){
		try{
			
			FileInputStream fin = new FileInputStream("MyFile.txt");
			FileOutputStream fout = new FileOutputStream("MyFile13.txt");
			int b;
			while((b=fin.read()) != -1){
				fout.write((b+2));
			}
			b=0;
			/*while((b=fout.read()) != -1){
				System.out.print((char)(b));
			}*/
			fin.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.print("Sorry");
		}
	}
}
