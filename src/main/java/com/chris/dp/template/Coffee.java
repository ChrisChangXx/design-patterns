package com.chris.dp.template;

/**
 * 咖啡
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
