package com.chris.dp.adapter;

/**
 * 野生火鸡
 *
 * @author zhangh
 * @date 2022/03/10
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("ji~ji~ji~");
    }

    @Override
    public void fly() {
        System.out.println("i am flying a short distance");
    }
}
