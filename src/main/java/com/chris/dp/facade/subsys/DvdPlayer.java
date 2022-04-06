package com.chris.dp.facade.subsys;

/**
 * dvd播放器
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class DvdPlayer {
    private String description;
    private Amplifier amplifier;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("dvd播放器开启");
    }

    public void off() {
        System.out.println("dvd播放器关闭");
    }

    public void eject() {
        System.out.println("dvd播放器弹出");
    }

    public void play(String movie) {
        System.out.println("dvd播放器播放：" + movie);
    }

    public void pause() {
        System.out.println("dvd播放器暂停");
    }

    public void stop() {
        System.out.println("dvd播放器停止");
    }

    public void setSurroundAudio() {
        System.out.println("dvd播放器设置环绕音频");
    }

    public void setTwoChannelAudio() {
        System.out.println("dvd播放器设置双声道音频");
    }

    public void setVolume(int level) {
        System.out.println("dvd播放器设置音量：" + level);
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }
}
