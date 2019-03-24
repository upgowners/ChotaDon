/* Steps:
	1. Create a folder with same name as package name.
	2. Add the java code into that folder.
	3. Go to that folder in cmd and compile the code.
	4. Come one step back using 'cd ..'
	5. Then run the code using 'java packagename.ClassName'
*/
package mypack;
class A
{
	public void display()
	{
		System.out.println("I am in A");
	}
}
class ADemo
{
	public static void main(String[] a)
	{
		A objA = new A();
		objA.display();
			
	}	
}