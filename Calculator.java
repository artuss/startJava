class Calculator {
    
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int result = 0;
        char sign = '%';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b > 0 || b < 0) {
                result = a / b;
            }
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            if (b > 0 || b < 0) {
                result = a % b;
            }
        }
        if ((b == 0 && sign == '/') || (b == 0 && sign == '%')) {
            System.out.println("На ноль делить нельзя!");
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}