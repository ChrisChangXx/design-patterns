package com.chris.dp.command.receiver;

/**
 * 立体声
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class Stereo {
    public void on() {
        System.out.println("音响打开了");
    }

    public void off() {
        System.out.println("音响关闭了");
    }

    public void setCd() {
        System.out.println("CD装进去了");
    }

    public void setVolume(int volume) {
        System.out.println("音量调到" + volume + "了");
    }
}
