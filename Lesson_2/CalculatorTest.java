import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userResponse;
        do {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            Calculator calc = new Calculator(a, sign, b);
            calc.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userResponse = scanner.next();
            } while (!(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("no")));
        } while (userResponse.equalsIgnoreCase("yes"));
    }
}