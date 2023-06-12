public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 400 == 0 || i % 100 != 0 && i % 4 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задание 8");
        int deposit = 29_000;
        for (int i = 1, sum = 0; i <= 12; i++) {
            sum += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", i, sum);
        }
    }


    public static void task9() {
        System.out.println("Задание 9");
        int deposit = 29_000;
        double percent = 12;
        double sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += deposit;
            sum += (sum * percent / 1200);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", i, sum);
        }
    }

    public static void task10() {
        System.out.println("Задание 10");
        for (int i = 1, sum; i <= 10; i++) {
            sum = 2 * i;
            System.out.printf("2*%d=%d%n", i, sum);
        }
    }
}
