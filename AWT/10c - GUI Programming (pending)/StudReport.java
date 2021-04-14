/*
10c. Design an AWT application to generate result marks sheet.
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class StudReport extends Applet implements ActionListener{
    Label labelTitle, labelRegNo, labelName, labelJava, blSE, blCA, blBI, blSSPD;
    TextField textRegNo, textName, textJava, textSE, textCA, textBI, textSSPD;
    Button ButtonReport;
    int total;
    float averageMarks;
 
    public void init(){
        setLayout(null);
        labelTitle = new Label("Enter Student's Details");
        labelRegNo = new Label("Reg. No:");
        labelName = new Label("Name:");
        labelJava = new Label("Java:");
        labelSE = new Label("SE:");
        labelCA = new Label("CA:");
        labelBI = new Label("BI:");
        labelSSPD = new Label("SSPD:");
        textRegNo = new TextField(10);
        textName = new TextField(25);
        textJava = new TextField(3);
        textSE = new TextField(3);
        textCA = new TextField(3);
        textBI = new TextField(3);
        textSSPD = new TextField(3);
        ButtonReport = new Button("View Student Result");

        labelTitle.setBounds(100,0,200,20);
        labelRegNo.setBounds(0,50,100,20);
        textRegNo.setBounds(120,50,100,20);
        labelName.setBounds(0,75,100,20);
        textName.setBounds(120,75,250,20);
        labelJava.setBounds(0,100,100,20);
        textJava.setBounds(120,100,40,20);
        labelSE.setBounds(0,125,100,20);
        textSE.setBounds(120,125,40,20);
        labelCA.setBounds(0,150,100,20);
        textCA.setBounds(120,150,40,20);
        labelBI.setBounds(0,175,100,20);
        textBI.setBounds(120,175,40,20);
        labelSSPD.setBounds(0,200,100,20);
        textSSPD.setBounds(120,200,40,20);
        ButtonReport.setBounds(100,225,150,30);

        add(labelTitle);
        add(labelRegNo);add(textRegNo);
        add(labelName);add(textName);
        add(labelJava);add(textJava);
        add(labelSE);add(textSE);
        add(labelCA);add(textCA);
        add(labelBI);add(textBI);
        add(labelSSPD);add(textSSPD);
        add(ButtonReport);

        ButtonReport.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            int java = Integer.parseInt(textJava.getText());
            int se = Integer.parseInt(textSE.getText());
            int ca = Integer.parseInt(textCA.getText());
            int bi = Integer.parseInt(textBI.getText());
            int sspd = Integer.parseInt(textSSPD.getText());

            total = (java+se+ca+bi+sspd);
            averageMarks = total/5;
        } catch(NumberFormatException e){
        }
    
        repaint();
    }

    public void paint(Graphics g){
        g.drawString("STUDENT REPORT",100,275);
        g.drawString("Reg. No.: " + textRegNo.getText(),0,300);
        g.drawString("Name : " + textName.getText(),0,325);
        g.drawString("Java:  " + textJava.getText(),0,350);
        g.drawString("Software Engineering : " + textSE.getText(),0,375);
        g.drawString("Computer Architecture : " + textCA.getText(),0,400);
        g.drawString("Banking & Insurance : " + textBI.getText(),0,425);
        g.drawString("SSPD : " + textSSPD.getText(),0,450);
        g.drawString("Total: " + total,0,475);
        g.drawString("Average: " + averageMarks,0,500);
    }
}