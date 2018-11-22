package gui4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class GuiTwo {
     public static void main(String[] args) {
        //woring without layout managers
        //step-1 (create container)
        Frame f=new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        //step-2 (create components)
        Label l1=new Label("Num-1");
        TextField t1=new TextField(10);
        Label l2=new Label("Num-2");
        TextField t2=new TextField(10);
        Button b1=new Button("Add");
        //step-3 (add the components on container)
        f.setLayout(null);
        
        l1.setSize(60,30);//w,h
        l1.setLocation(50,100);//x,y
        
        t1.setSize(100,30);
        t1.setLocation(120,100);
        
        l2.setBounds(50,150,60,30);//x,y,w,h
        t2.setBounds(120,150,100,30);
        
        b1.setBounds(90,200,60,40);
        
        f.add(l1); f.add(t1); 
        f.add(l2); f.add(t2);
        f.add(b1);
        
        
        
        
        
        
        
        
    }

}
