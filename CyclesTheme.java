import java.lang.Character;

public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1 - Подсчет суммы четных и нечетных чисел:");
        int pointA = -10;
        int pointB = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (pointA % 2 == 0) {
                sumEven += pointA;
            } else {
                sumOdd += pointA;
            }
            pointA++;
        } while(pointA <= pointB);

        System.out.println("В отрезке [" + pointA + ", " + pointB + "] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n2 - Вывод чисел в порядке убывания:");
        pointA = 10;
        pointB = 5;
        int pointC = -1;
        int max = pointA;
        int min = pointB;
        if (pointC > max) {
            max = pointC;
        } else if (pointC < min) {
            min = pointC;
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
        pointA = 1;
        pointB = 24;
        int count = 0;
        for (int i = pointA; i < pointB; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
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
        int i = 0;
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
        System.out.printf("%7s%10s%20s%n%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (i = 15; i <= 'z' ; i++) {
            if (i <= '/' && i % 2 != 0) {
                System.out.printf("%4d%9c%30s%n", i, i, Character.getName(i));
            } else if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%4d%9c%30s%n", i, i, Character.getName(i));
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
        int sumReght = 0;
        count = 0;
        System.out.print("Число " + num);
        while(num > 0) {
            if (count < 3) {
                sumReght += (num % 10);
                count++;
            } else {
                sumLeft += (num % 10);
            }
            num /= 10;
        }
        if (sumLeft == sumReght) {
            System.out.print(" является счастливым");
        } else {
            System.out.print(" не является счастливым");
        }
        System.out.println("\nСумма цифр " + leftPart + " = " + sumLeft +
                ", а сумма " + rightPart + " = " + sumReght);

        System.out.println("\n\n10 - Отображение таблицы умножения Пифагора:");
        System.out.println("   Таблица Пифагора");
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