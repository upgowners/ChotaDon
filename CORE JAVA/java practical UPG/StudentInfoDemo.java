import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class StudentInfo extends Frame implements WindowListener,ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b;
	StudentInfo()
	{
		setTitle("Student Information");
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		l1 = new Label("Name: ");
		l2 = new Label("Roll No: ");
		t1 = new TextField(10);
		t2 = new TextField(4);
		b = new Button("Display");
		l3 = new Label();
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		
		addWindowListener(this);
		b.addActionListener(this);
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void actionPerformed(ActionEvent ae)
	{
		l3.setText(t1.getText() + "  " + t2.getText());
	}
}
class StudentInfoDemo
{
	public static void main(String[] args)
	{
		StudentInfo s = new StudentInfo();
	}
}