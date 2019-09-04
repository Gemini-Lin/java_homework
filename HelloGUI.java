import java.awt.*;
import java.awt.event.*;

public class HelloGUI{
    public static void main(String args[]){
        Frame frame=new Frame("HelloGUI");
        Button button=new Button("Click me!");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button.setLabel("Hello~~");
            }
        });
        frame.add(button);
        frame.pack();
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
