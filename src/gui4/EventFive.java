package gui4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EventFive extends Frame {

class MyKeyHandler extends KeyAdapter{
    public void keyPressed(KeyEvent e){
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_ENTER){
            t2.setText(t1.getText());
        }
    }
}    
    
class MyWinHandler extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}    
    
    
public void initComponents(){
    setLayout(new FlowLayout());
    t1=new TextField(10); t2=new TextField(10);
    b1=new Button("Copy"); b2=new Button("Clear");
    b3=new Button("Exit");
    add(t1); add(t2);
    add(b1); add(b2); add(b3);
    addWindowListener(new MyWinHandler());
    t1.addKeyListener(new MyKeyHandler());
}    
public EventFive(){
    initComponents();
}    
public static void main(String args[]){
    EventFive ob=new EventFive();
    ob.setSize(500,500);
    ob.setVisible(true);
}


TextField t1,t2;
Button b1,b2,b3;

  

}
