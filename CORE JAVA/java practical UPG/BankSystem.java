import java.util.Scanner;

class BankSystem
{
	private String nameOfDepositor;
	private long accNumber;
	private String accType;
	private long balanceAmt;
	BankSystem()
	{
			nameOfDepositor = "";
			accNumber = 0L;
			accType = "";
			balanceAmt = 0L;
	}
	void setDetails()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 4 details :");
		accType = s.nextLine();
		nameOfDepositor = s.nextLine();
		accNumber = s.nextLong();
		balanceAmt = s.nextLong();
		
		
	}
	void getDetails()
	{
		System.out.println("name : " + nameOfDepositor);
		System.out.println(accNumber);
	}
	
}
class BankSystemDemo
{
	public static void main(String[] ar)
	{
		BankSystem bs = new BankSystem();
		bs.setDetails();
		bs.getDetails();
	}
}