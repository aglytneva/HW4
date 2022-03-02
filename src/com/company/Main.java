package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(" ");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
        System.out.println("Задание 2");
        System.out.println(" ");
        int friday = 3;
        for (int f = 0; f < 32; f++) {
            if (f % 7 - friday == 0) {
                System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println("\n");
        System.out.println("Задание 3");
        System.out.println(" ");
        int presentYear = 2021;
        int yearBefore_200 = presentYear - 200;
        int yearAfter_100 = presentYear + 100;
        for (int k = 0; k < yearAfter_100; k++) {
            if (k % 79 == 0 && k > yearBefore_200) {
                System.out.println(k);
            }
        }
    }
}
