import java.awt.*;
import java.awt.event.*;
class Cal extends Frame implements ActionListener,WindowListener
{
	TextField t1;
	Button b[] = new Button[16];
	Panel p;
	Cal()
	{
		setLayout(new FlowLayout());
		t1=new TextField(15);
		add(t1);
		
		setSize(200,200);
		setVisible(true);
		setTitle("Calculator");
		
		p = new Panel();
		p.setLayout(new GridLayout(4,4,10,10));
		String[] s = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","=","C"};
		for(int i = 0; i < 16; i++)
		{
			b[i] = new Button(s[i]);
		}
		for(int i = 0; i < 16; i++)
			p.add(b[i]);
		add(p);
		addWindowListener(this);
	}
	
	public void windowOpened(WindowEvent e){}
	public void windowClosing(WindowEvent e){
	  System.exit(0);
	}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void actionPerformed(ActionEvent ae){}
}
class CalDemo
{		
	public static void main(String[] arg)
	{
		Cal re = new Cal();
	}
}