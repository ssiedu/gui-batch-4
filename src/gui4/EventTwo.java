package gui4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventTwo extends Frame implements KeyListener {

public void initComponents(){
    setLayout(new FlowLayout());
    t1=new TextField(10); t2=new TextField(10);
    b1=new Button("Copy"); b2=new Button("Clear");
    b3=new Button("Exit");
    add(t1); add(t2);
    add(b1); add(b2); add(b3);
    t1.addKeyListener(this);
}    
public EventTwo(){
    initComponents();
}    
public static void main(String args[]){
    EventTwo ob=new EventTwo();
    ob.setSize(500,500);
    ob.setVisible(true);
}


TextField t1,t2;
Button b1,b2,b3;

    @Override
    public void keyTyped(KeyEvent e) {
        char ch=e.getKeyChar();
        if(ch=='@'){
            t1.setText("manoj@ssiedu.in");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //checking which key is pressed
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_F1){
            String s1=t1.getText();
            String s2=s1.toUpperCase();
            t1.setText(s2);
            
        }else if(code==KeyEvent.VK_F2){
            String s1=t1.getText();
            String s2=s1.toLowerCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
