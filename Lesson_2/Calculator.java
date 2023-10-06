public class Calculator {
    
    private int a;
    private char sign;
    private int b;
    
    public Calculator(int a, char sign, int b) {
        this.a = a;
        this.sign = sign;
        this.b = b;
    }

    public void calculate() {
        int result = 0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b > 0 || b < 0) {
                    result = a / b;
                }
                break;
            case '%':
                if (b > 0 || b < 0) {
                    result = a % b;
                }
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            default:
                System.out.println("Введенная мат. операция не поддерживается!");
                return;
        }
        if ((b == 0 && sign == '/') || (b == 0 && sign == '%')) {
            System.out.println("На ноль делить нельзя!");
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}