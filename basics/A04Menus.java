package basics;

import javax.swing.*;

public class A04Menus{
    public static void main(String[] args) {
        JFrame jF = new JFrame();
        jF.setTitle("Java Swing Menu Demo");
        jF.setSize(500, 500);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(null,"Hello"));
                fileMenu.add(newItem);
                fileMenu.addSeparator();

                menuBar.add(fileMenu);

                jF.setJMenuBar(menuBar);

                JLabel label = new JLabel("Welcome to Java");
                jF.add(label);
                jF.setVisible(true);
    }
}
