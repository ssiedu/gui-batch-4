package gui4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventFour extends Frame implements WindowListener  {

public void initComponents(){
    setLayout(new FlowLayout());
    t1=new TextField(10); t2=new TextField(10);
    b1=new Button("Copy"); b2=new Button("Clear");
    b3=new Button("Exit");
    add(t1); add(t2);
    add(b1); add(b2); add(b3);
    addWindowListener(this);
}    
public EventFour(){
    initComponents();
}    
public static void main(String args[]){
    EventFour ob=new EventFour();
    ob.setSize(500,500);
    ob.setVisible(true);
}


TextField t1,t2;
Button b1,b2,b3;

    @Override
    public void windowOpened(WindowEvent e) {
        setTitle("Welcome");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        setTitle("Stop");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        setTitle("Start");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        setTitle("");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        setTitle("Deactivated");
    }


}
