package basics;

import javax.swing.*;
import java.awt.*;

public class A00GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");

        frame.setLayout(new GridLayout(2, 3, 10, 10));

        for(int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
