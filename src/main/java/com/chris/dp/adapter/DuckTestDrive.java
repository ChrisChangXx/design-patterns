package com.chris.dp.adapter;

/**
 * 鸭试驾
 *
 * @author zhangh
 * @date 2022/03/10
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("火鸡先表演一波：");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("两只鸭子上场（怎么有一只看着这个奇怪）：");

        System.out.println("开嗓：");
        mallardDuck.quack();
        turkeyAdapter.quack();

        System.out.println("开飞：");
        mallardDuck.fly();
        turkeyAdapter.fly();
    }
}
