package gui4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventThree extends Frame implements MouseListener, MouseMotionListener {

public void initComponents(){
    setLayout(new FlowLayout());
    t1=new TextField(10); t2=new TextField(10);
    b1=new Button("Copy"); b2=new Button("Clear");
    b3=new Button("Exit");
    add(t1); add(t2);
    add(b1); add(b2); add(b3);
    t1.addMouseListener(this);
    t1.addMouseMotionListener(this);
}    
public EventThree(){
    initComponents();
}    
public static void main(String args[]){
    EventThree ob=new EventThree();
    ob.setSize(500,500);
    ob.setVisible(true);
}


TextField t1,t2;
Button b1,b2,b3;

    @Override
    public void mouseClicked(MouseEvent e) {
       int n=e.getClickCount();
       if(n==2){
           t2.setText(t1.getText());
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       int x=e.getX();
       int y=e.getY();
       int b=e.getButton();
       setTitle("Pressing Mouse @ "+x+","+y+","+b);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       setTitle("");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setTitle("Mouse In");
    }

    @Override
    public void mouseExited(MouseEvent e) {
       setTitle("Mouse Out");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        setTitle("Dragging @ "+x+","+y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        setTitle("Moving @ "+x+","+y);
    }

}
