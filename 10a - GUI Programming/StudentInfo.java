import java.awt.*;
import java.applet.*;

public class StudentInfo extends Applet{
	TextField namei, rolli, classi;
	Label lname, lroll, lclass;
	
	String sname = "", sroll = "", sclass = "";

    public void init(){
		namei = new TextField(20);
		rolli = new TextField(3);
		classi = new TextField(10);
		   
		lname = new Label("Name: ");
		lroll = new Label("Roll no: ");
		lclass = new Label("Class: ");
		   
		add(lname);
		add(namei);
		add(lroll);
		add(rolli);
		add(lclass);
		add(classi);
	}

	public void paint(Graphics g){
		if(sname != "" | sroll != "" | sclass != ""){
			g.drawString("Details:", 4, 100);
			g.drawString("Name: " + sname, 10, 125);
			g.drawString("Roll no: " + sroll, 10, 150);
			g.drawString("Class: " + sclass, 10, 175);
		}
    }

    public boolean action(Event event, Object obj){
		sname = namei.getText();
		sroll = rolli.getText();
		sclass = classi.getText();
		repaint();
		return true;
    }
}