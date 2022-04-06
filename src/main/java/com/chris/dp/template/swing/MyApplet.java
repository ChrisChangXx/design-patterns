package com.chris.dp.template.swing;

import java.applet.Applet;

/**
 * 我小应用程序
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class MyApplet extends Applet {
    String message;

    @Override
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }
}
