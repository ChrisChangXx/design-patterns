package com.chris.dp.template.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 我肋骨
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "i rule";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
