import java.io.*;
class Demo
{
	public static void main(String[] args) throws IOException
	{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		str = br.readLine();
		System.out.println("charAt Method: " + str.charAt(0));
		System.out.println("compareTo Method: " + str.compareTo("Rhitik"));
		System.out.println("concat Method: " + str.concat("Rhitik"));
		System.out.println("equals Method: " + str.equals(str));
		System.out.println("equalsIgnoreCase Method: " + str.equalsIgnoreCase("Rhitik"));
		System.out.println("indexOf Method: " + str.indexOf("R"));
		System.out.println("lastIndexOf Method: " + str.lastIndexOf("R"));
		System.out.println("length Method: " + str.length());
		System.out.println("replace Method: " + str.replace("R","r"));
		System.out.println("substring Method: " + str.substring(2));
		System.out.println("substring 2 Method: " + str.substring(2,4));
		System.out.println("toLowerCase Method: " + str.toLowerCase());
		System.out.println("toUpperCase Method: " + str.toUpperCase());
		System.out.println("trim Method: " + str.trim());
	}
}	