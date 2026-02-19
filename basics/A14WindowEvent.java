package basics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A14WindowEvent {
    public static void main(String[] args) {
        Frame f = new Frame("WindowEvent Example");

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                System.exit(0);
            }
        });

        f.setSize(300, 300);
        f.setVisible(true);
    }
}

