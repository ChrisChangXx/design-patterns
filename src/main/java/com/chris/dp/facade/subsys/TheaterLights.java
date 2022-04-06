package com.chris.dp.facade.subsys;

/**
 * 剧院灯光
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class TheaterLights {

    private String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("TheaterLights on");
    }

    public void off() {
        System.out.println("TheaterLights off");
    }

    public void dim(int level) {
        System.out.println("TheaterLights dimming to " + level);
    }
}
