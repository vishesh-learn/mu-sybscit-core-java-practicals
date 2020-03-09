import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FactEvent extends Applet implements ActionListener{
	TextField t1, t2;
	Button b1;
	Label l1, l2;
	FactEvent e;
	
	int fact = 1, m;
	String msg;
	
	public void init(){
		e = this;
		t1 = new TextField(3);
		t2 = new TextField(10);
		b1 = new Button("Find Factorial");
		l1 = new Label("Enter the number");
		l2 = new Label("Result");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		String str = t1.getText();
		int i;
		
		if(str!=""){
			int num = Integer.parseInt(str);
			
			for(i=num;i>0;i--)
				fact = fact*i;
			
			msg = ""+fact;
			
			t2.setText(msg);
			fact = 1;
		}
	}
}