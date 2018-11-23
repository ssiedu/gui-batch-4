package gui4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class GuiThree {

    public static void main(String args[]) {
        //working with multiple layout managers
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        Label l1 = new Label("Num-1");
        TextField t1 = new TextField(10);
        Label l2 = new Label("Num-2");
        TextField t2 = new TextField(10);
        Button b1 = new Button("Add");
        Button b2 = new Button("Sub");
        Button b3 = new Button("Div");
        Button b4 = new Button("Mul");
        Label l3 = new Label("Result");
        Checkbox c1=new Checkbox("Digits");
        Checkbox c2=new Checkbox("Words");

        Panel p=new Panel();
        p.setLayout(new GridLayout(1,2));
        p.add(c1); p.add(c2);
        
        Panel p1=new Panel();
        p1.setLayout(new GridLayout(3,2));
        Panel p2=new Panel();
        p2.setLayout(new FlowLayout());
        
        p1.add(l1); p1.add(t1);
        p1.add(l2); p1.add(t2);
        p1.add(l3); p1.add(p);
        
        p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4);
        
        f.add("North",p1); f.add("South",p2);
        
    }
}
