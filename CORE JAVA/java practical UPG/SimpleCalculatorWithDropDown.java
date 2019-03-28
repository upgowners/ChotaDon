import java.awt.*;
import java.awt.event.*;
class SimpleCalculatorWithDropDown extends Frame{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Choice c1;
	SimpleCalculatorWithDropDown(){
		setLayout(null);
		setSize(400,200);
		setVisible(true);
		l1 = new Label("Enter 1st no.");
		l1.setBounds(50,50,100,25);
		add(l1);
		t1 = new TextField();
		t1.setBounds(150,50,200,25);
		add(t1);
		l2 = new Label("Enter 2nd no.");
		l2.setBounds(50,80,100,25);
		add(l2);
		t2 = new TextField();
		t2.setBounds(150,80,200,25);
		add(t2);
		l3 = new Label("Result");
		l3.setBounds(50,115,50,25);
		add(l3);
		t3 = new TextField("Click here for result");
		t3.setEditable(false);
		t3.setBounds(110,115,210,25);
		t3.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {  
				String operator = c1.getItem(c1.getSelectedIndex());
				try{
					switch(operator){
						case "+":
							l4.setText(
								Float.toString(
									Float.parseFloat(t1.getText()) + Float.parseFloat(t2.getText())
								)
							);
							break;
						case "-":
							l4.setText(
								Float.toString(
									Float.parseFloat(t1.getText()) - Float.parseFloat(t2.getText())
								)
							);
							break;
						case "*":
							l4.setText(
								Float.toString(
									Float.parseFloat(t1.getText()) * Float.parseFloat(t2.getText())
								)
							);
							break;
						case "/":
							l4.setText(
								Float.toString(
									Float.parseFloat(t1.getText()) / Float.parseFloat(t2.getText())
								)
							);
							break;
					}
				}
				catch(NumberFormatException nfe){
					l4.setText("Input not a number.");
				}
			
			}
		});
		add(t3);
		c1 = new Choice();
		c1.setBounds(330,115,50,50);
		c1.add("+");
		c1.add("-");
		c1.add("*");
		c1.add("/");
		add(c1);
		l4 = new Label("0");
		l4.setBounds(200,135,200,50);
		add(l4);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
	}
	public static void main(String args[]){
		new SimpleCalculatorWithDropDown();
	}
}