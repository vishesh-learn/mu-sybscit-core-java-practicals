/*
9b. Design an AWT programto perform various string operationslike reverse string, string concatenation etc.
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class StringOperationsGUI extends Applet{
	TextField tf1, tf2;
	
	public StringOperationsGUI(){
		Label lb1 = new Label("Enter String :");
		Label lb2 = new Label("Result is :");
		tf1 = new TextField(25);
		tf2 = new TextField(25); 
		
		Button btn1 = new Button("Reverse");
		Button btn2 = new Button("To Uppercase");
		Button btn3 = new Button("To Lowercase");
		Button btn4 = new Button("Length");
		
		add(lb1); add(tf1);
		add(lb2); add(tf2);
		add(btn1); add(btn2); add(btn3); add(btn4);

		btn1.addActionListener(new Inner1());
		btn2.addActionListener(new Inner2());
		btn3.addActionListener(new Inner3());
		btn4.addActionListener(new Inner4());
	}

class Inner1 implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		StringBuffer sb = new StringBuffer(tf1.getText());
		tf2.setText(sb.reverse().toString());
	}
}

class Inner2 implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		String s = tf1.getText();
		tf2.setText(s.toUpperCase());
	}
}

class Inner3 implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		String s = tf1.getText();
		tf2.setText(s.toLowerCase());
	}
}

class Inner4 implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		String s = tf1.getText();
		tf2.setText("" + s.length());
	}
}

	public static void main(String ar[]){
		StringOperationsGUI fr = new StringOperationsGUI();
		fr.setSize(1000,300); 

		fr.setVisible(true);
	}
} 