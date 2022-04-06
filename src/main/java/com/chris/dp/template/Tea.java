package com.chris.dp.template;

/**
 * 茶
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
