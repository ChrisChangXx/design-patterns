package com.chris.dp.adapter;

/**
 * 野鸭
 *
 * @author zhangh
 * @date 2022/03/10
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("ga~ga~ga~");
    }

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
