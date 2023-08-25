public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1 - Перевод псевдокода на язык Java:");
        boolean genderMale = true;
        if (!genderMale) {
            System.out.println("Пол - женский");
        } else {
            System.out.println("Пол - мужской");
        }
        int age = 17;
        if (age > 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
        double height = 1.75;
        if (height < 1.8) {
            System.out.println("Вы не проходите по росту");
        } else {
            System.out.println("Допустимый рост");
        }
        char firstLetterName = "Ilitid".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква вашего имени - " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква вашего имени - " + firstLetterName);
        } else {
            System.out.println("Неизвестный символ");
        }

        System.out.println("\n2 - Поиск большего числа:");
        int num1 = 22;
        int num2 = 22;
        if (num1 > num2) {
            System.out.println("Число - " + num1 + " больше числа - " + num2);
        } else if (num2 > num1) {
            System.out.println("Число - " + num2 + " больше числа - " + num1);
        } else {
            System.out.println("Число - " + num1 + " равно числу - " + num2);
        }

        System.out.println("\n3 - Проверка числа:");
        int num = 0;
        if (num == 0) {
            System.out.println("Число равно 0");
        } else {
            System.out.print("Число " + num + " является ");
            if (num > 0) {
                System.out.print("положительным ");
            } else {
                System.out.print("отрицательным ");
            }
            if (num % 2 == 0) {
                System.out.print("и четным");
            } else {
                System.out.print("и нечетным");
            }
        }

        System.out.println("\n4 - Поиск одинаковых цифр в числах:");
        num1 = 123;
        num2 = 223;
        int num1Hundreds = num1 / 100;
        int num1Tens = (num1 % 100) / 10;
        int num1Ones = num1 % 10;
        int num2Hundreds = num2 / 100;
        int num2Tens = (num2 % 100) / 10;
        int num2Ones = num2 % 10;
        if ((num1Hundreds != num2Hundreds) && (num1Tens != num2Tens) && (num1Ones != num2Ones)) {
            System.out.println("Равных цифр нет");
        } else {
            System.out.println("В числах - " + num1 + " и " + num2 + " одинаковые цифры: ");
            if (num1Hundreds == num2Hundreds) {
                System.out.println(num1Hundreds + " в разряде - 1");
            }
            if (num1Tens == num2Tens) {
                System.out.println(num1Tens + " в разряде - 2");
            }
            if (num1Ones == num2Ones) {
                System.out.println(num1Ones + " в разряде - 3");
            }
        }

        System.out.println("\n5 - Определение символа по его коду:");
        char symb = '\u0057';
        System.out.print("Символ " + symb);
        if (symb >= 'a' && symb <= 'z') {
            System.out.print(" является маленькой буквой");
        } else if (symb >= 'W' && symb <= 'Z') {
            System.out.print(" является большой буквой");
        } else if (symb >= '0' && symb <= '9') {
            System.out.print(" является цифрой");
        } else {
            System.out.print(" не буква и не цифра");
        }

        System.out.println("\n\n6 - Подсчет суммы вклада и начисленных банком %:");
        double depositAmount = 301_000;
        double accruedInterest = 0;
        if (depositAmount < 100_000) {
            accruedInterest = depositAmount * .05;
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            accruedInterest = depositAmount * .07;
        } else if (depositAmount > 300_000) {
            accruedInterest = depositAmount * .1;
        }
        System.out.print("Сумма вклада = " + depositAmount + " руб " +
                "\nСумма начисленного % = " + accruedInterest + " руб " +
                "\nИтоговая сумма с % = " + (depositAmount + accruedInterest) + " руб");

        System.out.println("\n\n7 - Определение оценки по предметам:");
        int historyPrcent = 59;
        int programmingPercent = 92;
        int historyPoint = 0;
        int programmintPoint = 0;
        if (historyPrcent <= 60) {
            historyPoint = 2;
        } else if ((historyPrcent > 60) && (historyPrcent <= 73)) {
            historyPoint = 3;
        } else if ((historyPrcent > 73) && (historyPrcent <= 91)) {
            historyPoint = 4;
        } else if (historyPrcent > 91) {
            historyPoint = 5;
        }
        if (programmingPercent <= 60) {
            programmintPoint = 2;
        } else if ((programmingPercent > 60) && (programmingPercent <= 73)) {
            programmintPoint = 3;
        } else if ((programmingPercent > 73) && (programmingPercent <= 91)) {
            programmintPoint = 4;
        } else if (programmingPercent > 91) {
            programmintPoint = 5;
        }        
        System.out.println("Оценка по истории - " + historyPoint +
                "\nОценка по программированию - " + programmintPoint +
                "\nСредний балл оценок по предметам - " + ((historyPoint + programmintPoint) / 2) +
                "\nСредний % по предметам - " + ((historyPrcent + programmingPercent) / 2));

        System.out.println("\n\n8 - Расчет годовой прибыли:");
        double productSale = 13_000;
        double rent = 5_000;
        double costPrice = 9_000;
        double annualProfit = (productSale - (rent + costPrice)) * 12;
        System.out.print("Прибыль за год: ");
        if (annualProfit > 0) {
            System.out.print("+" + annualProfit + " руб.");
        } else {
            System.out.print(annualProfit + " руб.");
        }
    }
}