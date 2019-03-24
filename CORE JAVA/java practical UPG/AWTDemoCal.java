import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class AWT extends Frame implements WindowListener,ActionListener
{
	
	TextField tf;
	Panel p;
	AWT()
	{
		p = new Panel();
		setTitle("AWT demo");
		setSize(200,300);
		setVisible(true);
		//setResizable(false);
		
		setLayout(new FlowLayout());
		tf = new TextField(15);
		add(tf);
		
		p.setLayout(new GridLayout(4,4,10,20));
		Button b = new Button("1");
		Button b1 = new Button("2");
		Button b2= new Button("3");
		Button b3 = new Button("4");
		Button b4= new Button("5");
		Button b5 = new Button("6");
		Button b6 = new Button("7");
		Button b7 = new Button("8");
		Button b8 = new Button("9");
		Button b9 = new Button("0");
		
		
		
	
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);
		p.add(b8);
		p.add(b9);
		
		add(p);
		
		addWindowListener(this);
		b.addActionListener(this);
	}
	
	
	
	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){
		System.exit(0);
    }
	public void windowClosed(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	
	public void actionPerformed(ActionEvent ae){
		/*String s = (tf.getText() + tf1.getText()),s1 = "";
		for(int i = (s.length()-1); i >= 0; i--){
			s1 = s1 + s.charAt(i);
		}
		l1.setText(s1);
		System.out.println("Reverse String : " + s1);
		System.out.println("concated String : " + s);*/
	}
}
class AWTDemoCal
{
	public static void main(String[] args)
	{
		AWT a = new AWT();
	}
}