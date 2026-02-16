package basics;

import java.awt.*;
import java.awt.event.*;

public class A11ItemEvent {
    public static void main(String[] args) {
        Frame f = new Frame("ItemEvent Eg");
        Checkbox cb = new Checkbox("Check me");
        cb.setBounds(80, 40, 100, 30);

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox State: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        f.add(cb);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
