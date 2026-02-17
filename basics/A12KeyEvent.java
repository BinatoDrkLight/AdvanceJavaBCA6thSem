package basics;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class A12KeyEvent {
    public static void main(String[] args) {
        Frame f = new Frame("KeyEvent Eg");

        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
