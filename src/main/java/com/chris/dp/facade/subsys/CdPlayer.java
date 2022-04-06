package com.chris.dp.facade.subsys;

/**
 * cd播放器
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class CdPlayer {
    private String description;
    private Amplifier amplifier;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("cd播放器开启");
    }

    public void off() {
        System.out.println("cd播放器关闭");
    }

    public void eject() {
        System.out.println("cd播放器弹出");
    }

    public void pause() {
        System.out.println("cd播放器暂停");
    }

    public void play(String song) {
        System.out.println("cd播放器播放" + song);
    }

    public void stop() {
        System.out.println("cd播放器停止");
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }
}
