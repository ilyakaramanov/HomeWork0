public class HomeWork0 {

    public static void main(String[] args) {
        task1();
        task2();
        task4();
        task3();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
    }

    static void task1() {
        int a = 3;
        int S = a * a;
        System.out.println("Площадь " + S);
    }

    static void task2() {
        int V1 = 50;
        int V2 = 55;
        int S = 300;
        int T = 1;
        int S2 = S - (V1 * T + V2 * T);
        System.out.println("Расстояние " + Math.abs(S2));
    }

    static void task3() {
        int a = 10;
        int b = 5;
        int c = 2;
        double x1 = 0;
        double x2 = 0;
        int d = b * b - 4 * a * c;
        if (a > 0) {
            x1 = (-b + Math.abs(d)) / (2 * a);
            x2 = (-b - Math.abs(d)) / (2 * a);
            System.out.println("x1 равен " + x1);
            System.out.println("x2 равен " + x2);
        } else {
            System.out.println("Ошибка");
        }

    }

    static void task4() {
        int a = 5;
        if (a > 0) {
            a++;
        } else if (a < 0) {
            a = a - 2;
        } else {
            a = 10;
        }
        System.out.println(a);
    }

    static void task5() {
        int a = 5;
        int b = 3;
        int c = 2;
        int m1 = 0;
        int m2 = 0;


        if (a > b) {
            m1 = a;
            if (b > c)
                m2 = b;
            else
                m2 = c;
        } else {
            m1 = b;
            if (a > c)
                m2 = 1;
            else
                m2 = c;

        }
        int sum = m1 + m2;
        System.out.println("Сумма = " + sum);

    }


    static void task6() {
        int n = 3;
        if (n == 0) {
            System.out.println("Нулевое число");
        }
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Положительное четное число");
            } else {
                System.out.println("Положительное нечетное число");
            }
        }
        if (n < 0) {
            if (n % 2 == 0) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
            }
        }
    }

    static void task7() {
        int a = 4;
        int b = 3;
        if (a > 2 && b <= 3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void task8() {
        int a = 23;
        int b = 54;
        int c = 34;
        if (a < b && b < c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void task9() {
        int a = 3;
        int b = 3;
        int c = 0;
        int d = 3;
        if (a != b && a != c && a != d) {
            System.out.println("Первое число");
        } else if (b != a && b != c && b != d) {
            System.out.println("Второе число");
        } else if (c != a && c != b && c != d) {
            System.out.println("Третье число");
        } else {
            System.out.println("Четвертое число");
        }
    }

    static void task10() {
        int k = 5;
        if (k == 1) {
            System.out.println("Плохо");
        } else if (k == 2) {
            System.out.println("Неудовлетворительно");
        } else if (k == 3) {
            System.out.println("Удовлетворительно");
        } else if (k == 4) {
            System.out.println("Хорошо");
        } else if (k == 5) {
            System.out.println("Отлично");
        } else {
            System.out.println("Ошибка");
        }
    }

    static void task11() {
        int m = 12;
        if (m == 12 || m == 1 || m == 2) {
            System.out.println("Зима");
        } else if (m > 2 && m < 6) {
            System.out.println("Весна");
        } else if (m > 5 && m < 9) {
            System.out.println("Лето");
        } else if (m > 8 && m < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Ошибка");
        }
    }

    static void task12() {
        int n = 4;
        int a = 88;
        int b = 22;
        switch (n) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
        }
    }

    static void task13() {

        int a = 4;
        int b = 9;
        int n = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            n++;
        }
        System.out.println("Количество чисел: " + n);

    }

    static void task14() {
        int sum = 0;
        int a = 3;
        int b = 9;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел " + sum);
    }

    static void task15() {
        int n = 7;
        int mult = 1;
        for (int i = n; i > 0; i--) {
            mult = mult * i;
        }
        System.out.println("Произведение чисел " + mult);
    }

    static void task16() {
        int a = 15;
        int b = 4;
        while (a >= b) {
            a = a - b;
        }
        System.out.println("Длина незанятой части " + a);
    }

    static void task17() {
        int n = 10;
        int k = 0;
        while (3 * k <= n) {
            k++;
        }
        System.out.println("Наименьшее число " + k);
    }

    static void task18() {

        int n = 87634;
        int i = 0;
        while (n % 10 != 0) {
            i = n % 10;
            n = (n - i) / 10;
            System.out.println(i);
        }
    }

    static void task19() {
        int a = 1;
        int b = 5;
        for (int i = a; i <= b; i++) {
            for (int j = a; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(i);
        }


    }
}
