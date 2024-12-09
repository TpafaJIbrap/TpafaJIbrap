package Den1.two2;

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
    public static void chetN2echet() {

    }
}

