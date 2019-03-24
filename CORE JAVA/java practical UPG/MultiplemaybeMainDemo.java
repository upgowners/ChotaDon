import java.util.Scanner;
interface Result
{
	public void display();
}
class Marks
{
	int m1, m2;
	public void setMarks()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks 1: ");
		m1 = s.nextInt();
		System.out.println("Enter marks 2: ");
		m2 = s.nextInt();
	}
	public void getMarks()
	{
		System.out.println("Marks 1: " + m1);
		System.out.println("Marks 2: " + m2);
	}
}
class Student extends Marks implements Result
{
	String name;
	int rollno;
	public void setStudent()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = s.nextLine();
		System.out.println("Enter rollno: ");
		rollno = s.nextInt();
		setMarks();
	}
	public void display()
	{
		System.out.println("Name of the student is: " + name);
		System.out.println("Rollno of the student is: " + rollno);
		getMarks();
		System.out.println("Total Marks: " + (m1 + m2));
	}
}
class MainDemo
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.setStudent();
		s.display();
	}
}
