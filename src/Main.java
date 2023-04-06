import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main { public static void main(String[] args) {
        {
        System.out.println("Домашние задания. Цикл for");
        //task 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            }

        //task 2
        System.out.println("Задача 2");
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
            }

        //task 3
        System.out.println("Задача 3");
        for (int b = 0; b < 17; b = b + 2) {
            System.out.println(b);
            }

        //task 4
        System.out.println("Задача 4");
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
            }

        //task 5
        System.out.println("Задача 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
            }

        //task 6
        System.out.println("Задача 6");
        for (int e = 0; e < 100; e = e + 7) {
            System.out.println(e);
            }

        //task 7
        System.out.println("Задача 7");
        for (int f = 1; f < 600; f = f * 2) {
            System.out.println(f);
            }

        //task 8
        System.out.println("Задача 8");
        int deposit = 29_000;
        int total = 0;
        for (int k = 0; k < 12; k++) {
            total = total + deposit;
            System.out.println("Месяц " + k + ", сумма накоплений равна " + total);
            }
        System.out.println(total);

        //task 9
        int deposit1 = 29_000;
        int total1 = 0;
        for (int l = 0; l < 12; l++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + deposit1;
            System.out.println("Месяц " + l + ", сумма накоплений равна " + total1);
            }

        //task 10
        System.out.println("Задача 10");
        int v;
        for (int m = 1; m <= 10; m++) {
            v = m * 2;
            System.out.println("2*" + m + "=" + v);
            }
        }
    }
}