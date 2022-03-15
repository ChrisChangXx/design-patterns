package com.chris.dp.adapter;

/**
 * 火鸡适配器
 * 概念：
 * 适配器模式：将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
 * 1.火鸡是被适配者(adaptee)
 * 2.鸭子是目标接口(target)
 *
 * @author zhangh
 * @date 2022/03/10
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
