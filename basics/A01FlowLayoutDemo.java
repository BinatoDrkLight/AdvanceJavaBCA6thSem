package basics;

import javax.swing.*;
import java.awt.*;

public class A01FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrameObj = new JFrame("Flow Layout");

        jFrameObj.setLayout(new FlowLayout(FlowLayout.TRAILING));

        JButton jBtnObjOne = new JButton("b1");
        JButton jBtnObjTwo = new JButton("b2");
        JButton jBtnObjThree = new JButton("b3");
        JButton jBtnObjFour = new JButton("b4");
        JButton jBtnObjFive = new JButton("b5");
        JButton jBtnObjSix = new JButton("b6");

        jFrameObj.add(jBtnObjOne);
        jFrameObj.add(jBtnObjTwo);
        jFrameObj.add(jBtnObjThree);
        jFrameObj.add(jBtnObjFour);
        jFrameObj.add(jBtnObjFive);
        jFrameObj.add(jBtnObjSix);


        jFrameObj.setVisible(true);
        jFrameObj.setSize(400,400);

    }
}
