package gui4;

import java.awt.*;

public class GuiOne {
    public static void main(String[] args) {
        //working using layout managers
        //step-1 (create container)
        Frame f=new Frame();
        f.setSize(300, 300);
        f.setVisible(true);
        //step-2 (create components)
        Label l1=new Label("Num-1");
        TextField t1=new TextField(10);
        Label l2=new Label("Num-2");
        TextField t2=new TextField(10);
        Button b1=new Button("Add");
        //step-3 (add the components on container)
        //FlowLayout fL=new FlowLayout();
        //f.setLayout(fL);
        GridLayout gL=new GridLayout(3,2);
        f.setLayout(gL);
        //f.add("North",l1); f.add("South",t1); 
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(b1);
        
    }
    
}
