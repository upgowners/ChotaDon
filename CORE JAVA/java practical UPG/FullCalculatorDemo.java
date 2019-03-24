import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener
{
	TextField tf;
	Button[] b;
	Panel p;
	int num1=0,num2=0;
	String opr = "";
	Calculator()
	{
		tf = new TextField();
		p = new Panel();
		b = new Button[16];
		for(int i = 0; i<10; i++)
		{
			b[i] = new Button(""+i);
		}
		b[10] = new Button("*");
		b[11] = new Button("+");
		b[12] = new Button("-");
		b[13] = new Button("/");
		b[14] = new Button("=");
		b[15] = new Button("C");
		
		setLayout(new BorderLayout());
		add(tf,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		
		p.setLayout(new GridLayout(4,3));
		
		for(int i = 7; i <= 9;i++)
			p.add(b[i]);
		p.add(b[13]);
		for(int i = 4; i <= 6;i++)
			p.add(b[i]);
		p.add(b[10]);
		for(int i = 1; i <= 3;i++)
			p.add(b[i]);
		p.add(b[12]);
		p.add(b[15]);
		p.add(b[0]);
		p.add(b[11]);
		p.add(b[14]);
		
		
		for(int i = 0; i <= 15;i++)
			b[i].addActionListener(this);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		setVisible(true);
		setTitle("Calculator");
		p.setSize(200,200);
		setSize(300,400);
		setResizable(false);
	}
	public void actionPerformed(ActionEvent ae){
		if((ae.getActionCommand()) == b[15].getLabel())
			tf.setText("");
		else if((ae.getActionCommand()) == b[10].getLabel() || ae.getActionCommand() == b[11].getLabel() || ae.getActionCommand() == b[12].getLabel() || ae.getActionCommand() == b[13].getLabel())
		{
			num1 = Integer.parseInt(tf.getText());
			opr = ae.getActionCommand();
			tf.setText("");
		}
		else if((ae.getActionCommand()) == b[14].getLabel())
		{
			num2 = Integer.parseInt(tf.getText());
			if(opr.equals("+"))
				tf.setText(""+(num1+num2));
			else if(opr.equals("*"))
				tf.setText(""+(num1*num2));
			else if(opr.equals("/"))
				tf.setText(""+(num1/num2));
			else if(opr.equals("-"))
				tf.setText(""+(num1-num2));
		}
		else
			tf.setText(tf.getText() + ae.getActionCommand());
	}
	
}

class FullCalculatorDemo
{
	public static void main(String[] args){
		Calculator c = new Calculator();
	}
}
