package basics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A10ActionEvent {
     public static void main(String[] args) {
            Frame f = new Frame("ActionEvent Example");
            Button b = new Button("Click Me");
            b.setBounds(100, 50, 80, 30);

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button Clicked!");
                }
            });

            f.add(b);
            f.setSize(300, 300);
            f.setLayout(null);
            f.setVisible(true);
        }
}
