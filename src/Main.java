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
    {
        {
            System.out.println("Домашние задания. Циклы. Урок 2");
            //task 1
            System.out.println("Задача 1");
            int deposit = 15_000;
            int total = 0;
            int i = 0;
            while (total <= 2_459_000) {
                i++;
                total = total + deposit;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
                }

            //task 2
            System.out.println("Задача 2");
            int m = 1;
            while (m <= 10) {
                System.out.print(" " + m++);
                }
            System.out.println();
            for (int k = 10;  k >=1 ; k--) {
                System.out.print(" " + k);
                }
            System.out.println();

            //task 3
            System.out.println("Задача 3");
            int population = 12_000_000;
            int born = 17;
            int death = 8;
            int average = born - death;
            for (int year = 1; year <= 10; year++) {
                population += population * average / 1000;
                System.out.println("Год " + year + ", численность населения составляет " + population);
                }

            //task 4
            System.out.println("Задача 4");
            int summa = 15_000;
            double percent = 0.07;
            double totalSumma = 0;
            int v = 0;
            while (totalSumma <= 12_000_000) {
                v++;
                totalSumma += totalSumma * percent;
                totalSumma = totalSumma + summa;
                System.out.printf("Месяц " + v + " " + "%.2f",totalSumma);
                System.out.println();
                }
                System.out.println();

            //task 5
            System.out.println("Задача 5");
            int summa1 = 15_000;
            double percent1 = 0.07;
            double totalSumma1 = 0;
            int c = 0;
            for (; totalSumma1 <= 12_000_000; c++) {
                totalSumma1 += totalSumma1 * percent1;
                totalSumma1 = totalSumma1 + summa1;
                if (c % 6 == 0) {
                    System.out.printf("Месяц " + c + " " + "%.2f",totalSumma1);
                    System.out.println();
                    }
                }

            //task 6
            System.out.println("Задача 6");
            int summa2 = 15_000;
            double percent2 = 0.07;
            double totalSumma2 = 0;
            int month = 9 * 12;
            int z = 0;
            for (; z <= month; z++) {
                totalSumma2 += totalSumma2 * percent2;
                totalSumma2 = totalSumma2 + summa2;
                if (z % 6 == 0) {
                    System.out.printf("Месяц " + z + " " + "%.2f",totalSumma2);
                    System.out.println();
                    }
                }

            //task 7
            System.out.println("Задача 7");
            for (int d = 3; d <= 31; d = d + 7) {
                    System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет.");
                }

            //task 8
            System.out.println("Задача 8");
            int yearNow = 2023;
            int yearStart = yearNow - 200;
            int yearFinish = yearNow + 100;
            for (int comet = 0; comet < yearFinish; comet = comet + 79) {
                if (comet > yearStart) {
                    System.out.println(comet);
                    }
                }
            }
        }
    }
}
