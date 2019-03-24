import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class AWT extends Frame implements ActionListener
{
	Label l,l1;
	Button b;
	TextField tf,tf1;
	AWT()
	{
		setTitle("AWT demo");
		setSize(500,500);
		setVisible(true);
		//setResizable(false);
		
		l = new Label("Enter a String");
		tf = new TextField(10);
		tf1 = new TextField(10);
		b = new Button("Reverse");
		l1 = new Label();
		
		setLayout(new FlowLayout());
		
		add(l);
		add(tf);
		add(tf1);
		add(b);
		add(l1);
		this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
		
		b.addActionListener(this);
	}
	
	
	
	/*public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){
		System.exit(0);
    }
	public void windowClosed(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}*/
	
	public void actionPerformed(ActionEvent ae){
		String s = (tf.getText() + tf1.getText()),s1 = "";
		for(int i = (s.length()-1); i >= 0; i--){
			s1 = s1 + s.charAt(i);
		}
		l1.setText(s1);
		System.out.println("Reverse String : " + s1);
		System.out.println("concated String : " + s);
	}
}
class AWTStringOperation
{
	public static void main(String[] args)
	{
		AWT a = new AWT();
	}
}