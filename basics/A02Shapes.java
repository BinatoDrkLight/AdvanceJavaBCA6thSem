package basics;

import java.awt.*;
import javax.swing.JFrame;
public class A02Shapes extends Canvas{

    public void paint(Graphics g){
        setBackground(new Color(0xD0D89AFF, true));

        //Draw Rectangle
        g.drawRect(100, 50, 200, 120);
        //Draw Line
        g.drawLine(0, 0, 400, 400);
        //Draw Square
        g.drawRect(240, 200, 80, 80);
        //Draw Oval
        g.drawOval(30, 130, 50, 60);
        //Draw Circle
        g.drawOval(100, 220, 50, 50);


        //Fill Shape
        g.setColor(new Color(0x3500BB));
        g.fillRect(100, 50, 200, 120);
        g.setColor(Color.GREEN);
        g.fillRect(240, 200, 80, 80);
        g.setColor(Color.magenta);
        g.fillOval(30, 130, 50, 60);
        g.setColor(Color.ORANGE);
        g.fillOval(100, 220, 50, 50);

        g.setFont(new Font("Aerial", Font.PLAIN, 24));
        g.drawString("Hello", 170, 120);
    }
    public static void main(String[] args) {
        A02Shapes n = new A02Shapes();
        JFrame f = new JFrame();
        f.add(n);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
