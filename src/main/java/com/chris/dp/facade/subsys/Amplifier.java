package com.chris.dp.facade.subsys;

/**
 * 放大器
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class Amplifier {
    private String name;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public Amplifier(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " on");
    }

    public void off() {
        System.out.println(name + " off");
    }

    public void setCd() {
        System.out.println(name + " setCd");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println(name + " setDvd");
    }

    public void setStereoSound() {
        System.out.println(name + " setStereoSound");
    }

    public void setSurroundSound() {
        System.out.println(name + " setSurroundSound");
    }

    public void setTuner() {
        System.out.println(name + " setTuner");
    }

    public void setVolume(int volume) {
        System.out.println(name + " setVolume " + volume);
    }
}
