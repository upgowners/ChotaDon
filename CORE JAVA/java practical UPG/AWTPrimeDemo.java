import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

class Prime extends Frame implements WindowListener,ActionListener
{
	Label lbl,lb2;
	TextField txt;
	Button btn;
	Prime()
	{
		lbl = new Label("Number :");
		lb2 = new Label();
	
		txt = new TextField(10);
		btn = new Button("Prime");
		setLayout(new FlowLayout());
		
		setTitle("Prime");
		add(lbl);
		
		add(txt);
		add(btn);
		add(lb2);
		
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(this);
		btn.addActionListener(this);
	}
	
	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	
	public void actionPerformed(ActionEvent ae)
	{
		int num = Integer.parseInt(txt.getText());
		int flag = 1;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
				flag = 0;
		}
		if(flag != 0)
			lb2.setText("Prime number");
		else
			lb2.setText("Not a Prime number");
	}
}
class AWTPrimeDemo
{
	public static void main(String[] args)
	{
		Prime mf = new Prime();
	}
}