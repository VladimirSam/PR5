package ru.mirea.ikbo2019.Samsonov.pr5;
import java.util.Scanner;

public class Main {


    public static void f7(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            f7(n / k, k);
        } else {
            f7(n, ++k);
        }
    }

    public static String f8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return f8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int f9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return f9(a, b - 1) + f9(a - 1, b - 1);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("7. Введите число n, вам выведут все простые");
        System.out.println("множители в порядке неубывания с учетом кратности:");
        f7(scanner.nextInt(), 2);
        System.out.println();

        System.out.println("8. Введите слово из строчных латинских букв,");
        System.out.println("вам ответ на полиндром ли это:");
        System.out.println(f8(scanner.next()));
        System.out.println();

        System.out.println("9. Введите число a и b, вам выведут сколько существет");
        System.out.println("последовательностей из a нулей и b едениц, в которых два нуля не стоят рядом:");
        System.out.println(f9(scanner.nextInt(), scanner.nextInt()));
        System.out.println();





    }
}