package com.chris.dp.facade.subsys;

/**
 * 屏幕
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class Screen {
    private String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println("screen up");
    }

    public void down() {
        System.out.println("screen down");
    }
}
