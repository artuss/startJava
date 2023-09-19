import java.lang.Character;

public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1 - Подсчет суммы четных и нечетных чисел:");
        int startRange = -10;
        int endRange = 21;
        System.out.print("В отрезке [" + startRange + ", " + endRange);
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (startRange % 2 == 0) {
                sumEven += startRange;
            } else {
                sumOdd += startRange;
            }
            startRange++;
        } while(startRange <= endRange);

        System.out.print(" сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n\n2 - Вывод чисел в порядке убывания:");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
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
        int pointA = 1;
        int pointB = 24;
        int count = 0;
        for (int i = pointA; i < pointB; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n5 - Проверка количества двоек числа на четность/нечетность:");
        num = 3_242_592;
        System.out.print("В " + num);
        int countTwos = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                countTwos++;
            }
            num /= 10;
        }
        if (countTwos != 0) {
            if (countTwos % 2 == 0) {
                System.out.print(" (четное) количество двоек - " + countTwos);
            } else {
                System.out.print(" (нечетное) количество двоек - " + countTwos);
            }
        } else {
            System.out.print(" нет двоек");
        }

        System.out.println("\n\n6 - Отображение геометрических фигур:");
        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        int grid = 0;
        while (grid < 16) {
            System.out.print("#");
            if (grid == 5 || grid == 9 || grid == 12 || grid == 14) {
                System.out.println();
            }
            grid++;
        }

        System.out.println("\n");
        int dollar = 1;
        do {
            System.out.print("$");
            if (dollar == 1 || dollar == 3 || dollar == 6 || dollar == 8) {
                System.out.println();
            }
            dollar++;
        } while (dollar < 10);

        System.out.println("\n\n7 - Отображение ASCII-символов:");
        System.out.printf("%s%14s%19s%n%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i <= 'z' ; i++) {
            if (i <= '/' && i % 2 != 0) {
                System.out.printf("%-16d%-10c%s%n", i, i, Character.getName(i));
            } else if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%-16d%-10c%s%n", i, i, Character.getName(i));
            }
        }

        System.out.println("\n8 - Проверка, является ли число палиндромом:");
        num = 1_234_321;
        System.out.print("Число " + num);
        int copyNum = num;
        int reverseNum = 0;
        while(num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        if (copyNum == reverseNum) {
            System.out.print(" является палиндромом");
        } else {
            System.out.print(" не является палиндромом");
        }

        System.out.println("\n\n9 - Проверка, является ли число счастливым:");
        num = 123_321;
        int leftPart = num / 1000;
        int rightPart = num % 1000;
        int sumLeft = 0;
        int sumRight = 0;
        count = 0;
        System.out.print("Число " + num);
        while (num > 0) {
            if (count < 3) {
                sumRight += (num % 10);
                count++;
            } else {
                sumLeft += (num % 10);
            }
            num /= 10;
        }
        if (sumLeft == sumRight) {
            System.out.print(" является счастливым");
        } else {
            System.out.print(" не является счастливым");
        }
        System.out.println("\nСумма цифр " + leftPart + " = " + sumLeft +
                ", а сумма " + rightPart + " = " + sumRight);

        System.out.println("\n10 - Отображение таблицы умножения Пифагора:");
        System.out.println("   Таблица Пифагора");
        for (int i = 1; i < 10; i++) {
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