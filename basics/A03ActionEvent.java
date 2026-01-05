package basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class A03ActionEvent{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Action Event");
        JPanel jPanel = new JPanel();

        JLabel nameLabel = new JLabel("Name");
        JLabel passLabel = new JLabel("Pass");

        JTextField nameField = new JTextField(20);
        JTextField passField = new JTextField(20);

        JButton clickBtn = new JButton("Click");

        jPanel.add(nameLabel);
        jPanel.add(nameField);
        jPanel.add(passLabel);
        jPanel.add(passField);
        jPanel.add(clickBtn);
        jFrame.add(jPanel);

        jFrame.setVisible(true);
        jFrame.setSize(300, 300);

        clickBtn.addActionListener(e->{
            System.out.println("Clicked");
            JOptionPane.showInputDialog("Welcome :: " + nameField.getText());

        });

        jFrame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
