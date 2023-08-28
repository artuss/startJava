public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1 - Подсчет суммы четных и нечетных чисел:");
        int a = -10;
        int b = 21;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("В отрезке [" + a + ", " + b + "] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n2 - Вывод чисел в порядке убывания:");
        a = 10;
        b = 5;
        int c = -1;
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        if (c > max) {
            max = c;
        } else if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3 - Вывод реверсивного числа и суммы его цифр:");
        int num = 1234;
        int sum = 0;
        System.out.print("Сумма цифр числа - ");
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.print(" равна - " + sum);

        System.out.println("\n\n4 - Вывод чисел в несколько строк:");
        a = 1;
        b = 30;
        for (int i = a; i < b; i++) {
            System.out.printf("%3d", i);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        int i = b - 1;
        while (i % 5 != 0) {
            System.out.printf("%3d", 0);
            i++;
        }

        System.out.println("\n\n5 - Проверка количества двоек числа на четность/нечетность:");
        num = 3242592;
        System.out.print("В " + num);
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 2) {
                count++;
            }
            num /= 10;
        }
        if (count != 0) {
            if (count % 2 == 0) {
                System.out.print(" (четное) количество двоек - " + count);
            } else {
                System.out.print(" (нечетное) количество двоек - " + count);
            }
        } else {
            System.out.print(" нет двоек");
        }

        System.out.println("\n\n6 - Отображение геометрических фигур:");
        for (i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        i = 0;
        while (i < 16) {
            System.out.print("#");
            if (i == 5 || i == 9 || i == 12 || i == 14) {
                System.out.println();
            }
            i++;
        }

        System.out.println("\n");
        i = 1;
        do {
            System.out.print("$");
            if (i == 1 || i == 3 || i == 6 || i == 8) {
                System.out.println();
            }
            i++;
        } while (i < 10);

        System.out.println("\n\n7 - Отображение ASCII-символов:");
        System.out.printf("%7s%10s%n", "DECIMAL", "CHARACTER");
        for (i = '!'; i <= 'z' ; i++) {
            if (i <= '/' && i % 2 != 0) {
                System.out.printf("%4d%9s%n", i, (char) i);
            } else if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%4d%9s%n", i, (char) i);
            }
        }

        System.out.println("\n\n8 - Проверка, является ли число палиндромом:");
        num = 1234321;
        int numNew = 0;
        while (num > 0) {
            
        }
    }
}