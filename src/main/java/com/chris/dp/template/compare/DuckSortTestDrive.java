package com.chris.dp.template.compare;

import java.util.Arrays;

/**
 * 鸭类测试驱动
 *
 * @author zhangh
 * @date 2022/04/06
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[7];

        ducks[0] = new Duck("Daffy", 8);
        ducks[1] = new Duck("Dewey", 2);
        ducks[2] = new Duck("Howard", 10);
        ducks[3] = new Duck("Louie", 8);
        ducks[4] = new Duck("Donald", 2);
        ducks[5] = new Duck("Huey", 5);
        ducks[6] = new Duck("Dewey", 1);

        display(ducks);

        System.out.println("------");
        Arrays.sort(ducks);
        System.out.println("------");

        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
