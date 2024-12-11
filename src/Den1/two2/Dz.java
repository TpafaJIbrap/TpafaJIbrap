package Den1.two2;

import java.util.Arrays;
import java.util.Scanner;

public class Dz {

    /**
     * Ввести целое число в консоли.  Если оно является
     * положительным, то прибавить к нему 1, в противном
     * случае не изменять его. Вывести полученное число.
     */

    public static void plusPrint() {
        int s = enter();
        if (s >= 0) {
            s = s + 1;
            System.out.println(s);
        } else {
            System.out.println(s);
        }
    }

    public static int enter() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    /**
     * Ввести целое число в консоли. Если оно является
     * положительным, то прибавить к нему 1; если
     * отрицательным, то вычесть из него 2; если нулевым,
     * то заменить его на 10. Вывести полученное число.
     */
    public static void plusMinusDes() {
        int s = enter();
        if (s > 0) {
            s = s + 1;
            System.out.println(s);
        } else if (s < 0) {
            s = s - 2;
            System.out.println(s);
        } else {
            s = 10;
            System.out.println(s);
        }
    }


    /**
     * Ввести три целых числа с консоли. Вывести на
     * экран наименьшее из них.
     */
    public static void minimumInt() {
        int mini;
        int a = enter();
        int b = enter();
        int c = enter();
        mini = a < b ? a : b;
        mini = mini < c ? mini : c;
        System.out.println(mini);
    }


    /**
     * Ввести целое число в консоли. Вывести его строку
     * описание вида «отрицательное четное число»,
     * «нулевое число»,  «положительное нечетное число» и
     * т. д.
     */
    public static void chetNechet() {
        int number = enter();
        if (number == 0) {
            System.out.println("Нулевое число");
        } else {
            if (number < 0) {
                System.out.print("Отрицательное");
            } else {
                System.out.print("Положительное");
            }
            if (number % 2 == 0) {
                System.out.print(" четное число");
            } else {
                System.out.print(" нечетное число");
            }
        }
    }

    /**
     * Написать программу, вычисляющую стоимость 10
     * минутного междугороднего разговора в зависимости
     * от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
     * 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
     * руб. ). Пользователь в консоли должен ввести код
     * города, а в ответ от программы получить, например,
     * при вводе кода 905, - «Москва. Стоимость разговора:
     * 41.5»
     */
    public static void pricePhone() {
        int code = enterCode();
        if (code == 905) {
            System.out.println("Москва. Стоимость разговора: 41.5руб.");
        } else {
            if (code == 194) {
                System.out.print("Ростов. Стоимость разговора: 1.98руб.");
            } else {
                if (code == 491) {
                    System.out.print("Краснодар. Стоимость разговора: 2.69руб.");
                } else {
                    if (code == 800) {
                        System.out.print("Киров. Стоимость разговора: 5.00руб.");
                    } else {
                        System.out.print("Такого города нет в базе");
                    }
                }
            }
        }
    }

    public static int enterCode() {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Дан массив целых чисел:
     * [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
     * массива найти и вывести на экран:
     * - максимальное значение
     * - сумму положительных элементов
     * - сумму четных отрицательных элементов
     * - количество положительных элементов
     * - среднее арифметическое отрицательных элементов
     */
    public static void massSearch() {
        int[] mass = new int[]{1, 10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = mass[0];
        int sump = 0;
        int sumc = 0;
        int kolvo = 0;
        double midl;
        int w = 0;
        int sum = 0;
        for (int a : mass) {
            if (max < a) max = a;
            if (a > 0) sump = a + sump;
            if (a > 0) kolvo = kolvo+1;
            if (a % 2 == 0 & a < 0) sumc = a + sumc;
            if (a < 0) {
                sum = a + sum;
                w = w+1;
            }
        }
        midl = (double) sum / w;
        System.out.println(max);
        System.out.println(sump);
        System.out.println(sumc);
        System.out.println(kolvo);
        System.out.println(midl);
    }

    /**
     *  Дан массив целых чисел:
     * [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
     * Переставить элементы массива в обратном порядке.
     * Вывести результат в консоль
     */
    public static void m3assSearch() {
        int[] mass = new int[]{1, 10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = mass[0];
        int sump = 0;
        int sumc = 0;
        int kolvo = 0;
        double midl;
        int w = 0;
        int sum = 0;
        for (int a : mass) {
            if (max < a) max = a;
            if (a > 0) sump = a + sump;
            if (a > 0) kolvo = kolvo+1;
            if (a % 2 == 0 & a < 0) sumc = a + sumc;
            if (a < 0) {
                sum = a + sum;
                w = w+1;
            }
        }
        midl = (double) sum / w;
        System.out.println(max);
        System.out.println(sump);
        System.out.println(sumc);
        System.out.println(kolvo);
        System.out.println(midl);
    }
}
