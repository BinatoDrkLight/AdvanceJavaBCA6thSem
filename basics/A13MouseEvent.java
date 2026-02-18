package basics;

import java.awt.*;
import java.awt.event.*;

public class A13MouseEvent{
    public static void main(String[] args) {
        Frame f = new Frame("MouseEvent Example");

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
