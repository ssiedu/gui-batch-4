package gui4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class GuiFour extends Frame {
    
    public GuiFour(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        add(t1); add(t2); add(b1); add(b2);        
    }
    public static void main(String[] args) {
        GuiFour ob=new GuiFour();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
    
    TextField t1,t2;
    Button b1,b2;
}
