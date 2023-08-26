public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1 - Вывод характеристик компьютера:");
        byte ram = 8;
        short ssdSize = 250;
        int typeOfSystem = 64;
        long gpuModel = 3050L;
        float cpuFrequency = 3.7f;
        double osAssembly = 19045.2965;
        char pcManufacturer1 = 'h';
        char pcManufacturer2 = 'p';
        boolean isLaptop = true;
        System.out.println("ОЗУ - " + ram + "Гб;\n" +
                "Объем SSD-накопителя - " + ssdSize + "Гб;\n" +
                "Тип ОС - " + typeOfSystem + "бит;\n" +
                "Модель видеокарты - GTX" + gpuModel + ";\n" +
                "Частота процессора - " + cpuFrequency + "ГГц;\n" +
                "Сборка ОС - " +osAssembly + ";\n" +
                "Производитель ПК - " + pcManufacturer1 + "" + pcManufacturer2 + ";\n" +
                "Ноутбук - " + isLaptop + ".\n");

        System.out.println("2 - Расчет стоимости товара со скидкой:");
        double penPrice = 100;
        double bookPrice = 200;
        double fullPrice = penPrice + bookPrice;
        double discount = .11;
        double discountAmount = fullPrice * discount;
        System.out.println("Общая стоимость товаров - " + fullPrice + " руб;\n" +
                "Сумма скидки - " + discountAmount + " руб;\n" +
                "Общая стоимость товаров со скидкой - " +  (fullPrice - discountAmount) + " руб;\n");

        System.out.println("3 - Вывод слова JAVA:\n" +
                "   J    a  v     v  a     \n" +
                "   J   a a  v   v  a a    \n" +
                "J  J  aaaaa  V V  aaaaa   \n" +
                " JJ  a     a  V  a     a  \n");

        System.out.println("4 - Вывод min и max значений целых числовых типов:");
        byte numByte = 127;
        short numShort = 32_767;
        int numInt = 2_147_483_647;
        long numLong = 9_223_372_036_854_775_807L;
        System.out.println("Тип - byte. Первоначальное значение - " + numByte + ", после инкремента - " + (++numByte) +
                ", значение после декремента - " + (--numByte) +
                "\nТип - short. Первоначальное значение - " + numShort + ", после инкремента - " + (++numShort) +
                ", значение после декремента - " + (--numShort) +
                "\nТип - int. Первоначальное значение - " + numInt + ", после инкремента - " + (++numInt) +
                ", значение после декремента - " + (--numInt) +
                "\nТип - long. Первоначальное значение - " + numLong + ", после инкремента - " + (++numLong) +
                ", значение после декремента - " + (--numLong));

        System.out.println("\n5 - Перестановка значений переменных:");
        int a = 2;
        int b = 5;
        System.out.print("Способ 1. Третья переменная. Исходные значения - " + a + " и " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(". Новые значения - " + a + " и " + b + ".");
        System.out.print("Способ 2. Арифметическая операция. Исходные значения - " + a + " и " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println(". Новые значения - " + a + " и " + b + ".");
        System.out.print("Способ 2. Побитовая операция- ^. Исходные значения - " + a + " и " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(". Новые значения - " + a + " и " + b + ".");

        System.out.println("\n6 - Вывод символов и их кодов:");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + "    " + dollar +
                "\n" + (int) asterisk + "    " + asterisk +
                "\n" + (int) atSign + "    " + atSign +
                "\n" + (int) verticalBar + "   " + verticalBar +
                "\n" + (int) tilde + "   " + tilde);

        System.out.println("\n7 - Вывод в консоль ASCII-арт Дюка:");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backSlash + "\n   " +
                slash + "  " + backSlash + "\n  " +
                slash + underscore + leftParenthesis + " " + rightParenthesis + backSlash + "\n " +
                slash + "      " + backSlash + "\n" +
                slash + underscore + underscore + underscore + underscore + slash + backSlash + 
                underscore + underscore + backSlash);

        System.out.println("\n8 - Вывод количества сотен, десятков и единиц числа:");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int numbersProduct = hundreds * tens * ones;
        System.out.println("Число - " + num + " содержит:" +
                "\n   сотен - " + hundreds +
                "\n   десятков - " + tens +
                "\n   единиц - " + ones +
                "\nСумма его цифр = " + sum +
                "\nПроизведение = " + numbersProduct);

        System.out.println("\n9 - Вывод времени:");
        num = 86399;
        int hour = num / 3600;
        int min = num / 60 % 60;
        int sec = num % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}