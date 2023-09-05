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
        int num = 1_234;
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
        num = 3_242_592;
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
        num = 1_234_321;
        int numCopy1 = num;
        int numCopy2 = num;
        System.out.print("Число " + numCopy2);
        int pow = 0;
        while (num > 1) {
            int digit = num % 10;
            num /= 10;
            pow++;
        }
        int newNum = 0;
        while (numCopy1 > 0) {
            int digit = numCopy1 % 10;
            int powNum = 1;
            for (i = 1; i <= pow; i++) {
                powNum *= 10;
            }
            int tmp = digit * powNum;
            newNum += tmp;
            pow--;
            numCopy1 /= 10;
        }
        if (numCopy2 == newNum) {
            System.out.print(" является палиндромом");
        } else {
            System.out.print(" не является палиндромом");
        }

        System.out.println("\n\n9 - Проверка, является ли число счастливым:");
        num = 123_341;
        int sumLeft = 0;
        int sumReght = 0;
        System.out.print("Число " + num);
        int numLeft = num / 1000;
        while(numLeft > 0) {
            int digit = numLeft % 10;
            sumLeft += digit;
            numLeft /= 10;
        }
        int numReight = num % 1000;
        while(numReight > 0) {
            int digit = numReight % 10;
            sumReght += digit;
            numReight /= 10;
        }
        if (sumLeft == sumReght) {
            System.out.print(" является счастливым");
        } else {
            System.out.print(" не является счастливым");
        }
        System.out.println(" сумма цифр " + (num / 1000) + " = " + sumLeft +
                ", а сумма " + (num % 1000) + " = " + sumReght);

        System.out.println("\n\n10 - Отображение таблицы умножения Пифагора:");
        System.out.println("   Таблица пифагора");
        for (i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("  |");
            } else {
                System.out.printf("%2d%s", i, "|");
            }
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
            if (i == 1) {
                System.out.println("---------------------------");
            }
        }
    }
}