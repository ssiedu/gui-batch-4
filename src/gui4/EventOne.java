package gui4;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventOne extends Frame implements ActionListener, TextListener, ItemListener, FocusListener {

public void initComponents(){
    setLayout(new FlowLayout());
    ch=new Choice();
    ch.add("MP"); 
    ch.add("MH");
    ch.add("RJ");
    add(ch);
    t1=new TextField(10); t2=new TextField(10);
    b1=new Button("Copy"); b2=new Button("Clear");
    b3=new Button("Exit");
    add(t1); add(t2);
    add(b1); add(b2); add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    t1.addTextListener(this);
    ch.addItemListener(this);
    b3.setEnabled(false);
    b2.addFocusListener(this);
}    
public EventOne(){
    initComponents();
}    
public static void main(String args[]){
    EventOne ob=new EventOne();
    ob.setSize(500,500);
    ob.setVisible(true);
}


    @Override
    public void actionPerformed(ActionEvent e) {
       //trace the event source
       if(e.getSource()==b1){
            String s=t1.getText();
            t2.setText(s);
       }else if(e.getSource()==b2){
           t1.setText(""); t2.setText("");
           t1.requestFocus();
       }else if(e.getSource()==b3){
           System.exit(0);
       }
    }
    @Override
    public void textValueChanged(TextEvent e) {
        String s=t1.getText();
        t2.setText(s);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        int idx=ch.getSelectedIndex();
        switch(idx){
            case 0:
                t1.setText("Bhopal");
            break;
            case 1:
                t1.setText("Mumbai");
            break;
            case 2:
                t1.setText("Jaipur");
            break;
        }
    }
  
    
    TextField t1,t2;
    Button b1,b2,b3;
    Choice ch;

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource()==b2){
            b3.setEnabled(true);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
       if(e.getSource()==b2){
           b3.setEnabled(false);
       }
    }

}
