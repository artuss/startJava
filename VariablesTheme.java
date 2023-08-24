public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1 - Вывод характеристик компьютера:");
        byte ram = 8;
        short ssdSize = 250;
        int typeOfSystem = 64;
        long gpuModel = 3050L;
        float cpuFrequency = 3.7f;
        double osAssembly = 19045.2965;
        char pcManufacturer1 = 104;
        char pcManufacturer2 = 112;
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
                "Общая стоимость товаров со скидкой - " +  (fullPrice + discountAmount) + " руб;\n");

        System.out.println("3 - Вывод слова JAVA:\n" +
                "   J    a  v     v  a     \n" +
                "   J   a a  v   v  a a    \n" +
                "J  J  aaaaa  V V  aaaaa   \n" +
                " JJ  a     a  V  a     a  ");

        System.out.println("4 - Вывод min и max значений целых числовых типов:");
        byte num1 = 127;
        short num2 = 32_767;
        int num3 = 2_147_483_647;
        long num4 = 9_223_372_036_854_775_807L;
        System.out.println("Тип - byte. Первоначальное значение - " + num1 + ", после инкремента - " + (++num1) +
                ", значение после декремента - " + (--num1) +
                "\nТип - short. Первоначальное значение - " + num2 + ", после инкремента - " + (++num2) +
                ", значение после декремента - " + (--num2) +
                "\nТип - int. Первоначальное значение - " + num3 + ", после инкремента - " + (++num3) +
                ", значение после декремента - " + (--num3) +
                "\nТип - long. Первоначальное значение - " + num4 + ", после инкремента - " + (++num4) +
                ", значение после декремента - " + (--num4));

        System.out.println("\n5 - Перестановка значений переменных:");
        int digit1 = 2;
        int digit2 = 5;
        System.out.print("Способ 1. Третья переменная. Исходные значения - " + digit1 + " и " + digit2);
        int tmp = digit1;
        digit1 = digit2;
        digit2 = tmp;
        System.out.println(". Новые значения - " + digit1 + " и " + digit2 + ".");
        System.out.print("Способ 2. Арифметическая операция. Исходные значения - " + digit1 + " и " + digit2);
        int sum = digit1 + digit2;
        digit1 = sum - digit1;
        digit2 = sum - digit2;
        System.out.println(". Новые значения - " + digit1 + " и " + digit2 + ".");
        System.out.print("Способ 2. Побитовая операция- ^. Исходные значения - " + digit1 + " и " + digit2);
        sum = digit1 ^ digit2;
        digit1 = sum ^ digit1;
        digit2 = sum ^ digit2;
        System.out.println(". Новые значения - " + digit1 + " и " + digit2 + ".");

        System.out.println("\n6 - Вывод символов и их кодов:");
        char symb1 = '$';
        char symb2 = '*';
        char symb3 = '@';
        char symb4 = '|';
        char symb5 = '~';
        System.out.println((int) symb1 + "    " + symb1 +
                "\n" + (int) symb2 + "    " + symb2 +
                "\n" + (int) symb3 + "    " + symb3 +
                "\n" + (int) symb4 + "   " + symb4 +
                "\n" + (int) symb5 + "   " + symb5);

        System.out.println("\n7 - Вывод в консоль ASCII-арт Дюка:");
        symb1 = '/';
        symb2 = 92;
        symb3 = '_';
        symb4 = '(';
        symb5 = ')';
        System.out.println("    " + symb1 + symb2 +
                "\n   " + symb1 + "  " + symb2 +
                "\n  " + symb1 + symb3 + symb4 + " " + symb5 + symb2 +
                "\n " + symb1 + "      " + symb2 +
                "\n" + symb1 + symb3 + symb3 + symb3 + symb3 + symb1 + symb2 + symb3 + symb3 + symb2);

        System.out.println("\n8 - Вывод количества сотен, десятков и единиц числа:");
        int num = 123;
        int hundreds = num / 100;
        int dozens = (num % 100) / 10;
        int units = num % 10;
        sum = hundreds + dozens + units;
        int productOfNumbers = hundreds * dozens * units;
        System.out.println("Число - " + num + " содержит:" +
                "\n   сотен - " + hundreds +
                "\n   десятков - " + dozens +
                "\n   единиц - " + units +
                "\nСумма его цифр = " + sum +
                "\nПроизведение = " + productOfNumbers);

        System.out.println("\n9 - Вывод времени:");
        num = 86399;
        int hour = num / 3600;
        int min = (num % 3600) / 60;
        int sec = (num % 3600) % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}