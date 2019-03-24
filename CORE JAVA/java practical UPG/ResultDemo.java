import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
class Result extends Frame implements ActionListener,WindowListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b2,b1;
	Result()
	{
		l1=new Label("marks 1");
		l2=new Label("marks 2");
		l3=new Label("marks 3");
		l4=new Label();
		t1=new TextField(5);
		t2=new TextField(5);
		t3=new TextField(5);
		b1=new Button("Display");
		b2=new Button("Clear");
		
		setSize(500,500);
		setVisible(true);
		setTitle("Results");
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(l4);
		addWindowListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void windowOpened(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			int i1 = Integer.parseInt(t1.getText());
			int i2 = Integer.parseInt(t2.getText());
			int i3 = Integer.parseInt(t3.getText());
			l4.setText("" + (i1+i2+i3));
		}
		else
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}	
	}
}
class ResultDemo
{		
	public static void main(String[] arg)
	{
		Result re=new Result();
	}
}