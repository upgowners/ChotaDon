import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

class Reverse extends Frame implements WindowListener,ActionListener
{
	Label lbl,lb2;
	TextField txt;
	Button btn;
	Reverse()
	{
		lbl = new Label("Number :");
		lb2 = new Label();
	
		txt = new TextField(10);
		btn = new Button("Reverse");
		setLayout(new FlowLayout());
		
		setTitle("Reverse");
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
		int remainder =0,rev = 0;
		while(num > 0)
		{
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		lb2.setText(rev + "");
	}
}
class AWTReverseDemo
{
	public static void main(String[] args)
	{
		Reverse mf = new Reverse();
	}
}