package com.chris.dp.facade.subsys;

/**
 * 爆米花波普尔
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class PopcornPopper {
    private String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("PopcornPopper on");
    }

    public void pop() {
        System.out.println("PopcornPopper pop");
    }

    public void off() {
        System.out.println("PopcornPopper off");
    }
}
