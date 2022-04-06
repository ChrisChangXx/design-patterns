package com.chris.dp.facade.subsys;

/**
 * 投影仪
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class Projector {
    private String description;
    private DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void tvMode() {
        System.out.println("Projector tvMode");
    }

    public void wideScreenMode() {
        System.out.println("Projector wideScreenMode");
    }
}
