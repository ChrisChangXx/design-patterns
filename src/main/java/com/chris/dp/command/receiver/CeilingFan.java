package com.chris.dp.command.receiver;

/**
 * 吊扇
 *
 * @author zhangh
 * @date 2022/03/09
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;

    public CeilingFan() {
        this.speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("吊扇风量调到了高档");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("吊扇风量调到了中档");
    }

    public void low() {
        speed = LOW;
        System.out.println("吊扇风量调到了低档");
    }

    public void off() {
        speed = OFF;
        System.out.println("吊扇关闭");
    }

    public int getSpeed() {
        return this.speed;
    }
}
