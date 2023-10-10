public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Avenger");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(81.77f);
        jaegerOne.setWeight(2.004f);
        jaegerOne.setStrength(10);
        jaegerOne.setArmor(8);

        System.out.println("Имя модели: " + jaegerOne.getModelName() + "\n" +
                "Поколение: " + jaegerOne.getMark() + "\n" +
                "Страна: " + jaegerOne.getOrigin() + "\n" +
                "Рост: " + jaegerOne.getHeight() + "м\n" +
                "Вес: " + jaegerOne.getWeight() + "т\n" +
                "Сила: " + jaegerOne.getStrength() + "\n" +
                "Броня: " + jaegerOne.getArmor() + "\n");

        System.out.println("Дрифт - " + jaegerOne.isDrift());
        jaegerOne.move();
        System.out.println("Сканирование - " + jaegerOne.scanKaiju());
        jaegerOne.useAbility();

        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 8, 6);
        System.out.println("\nИмя модели: " + jaegerTwo.getModelName() + "\n" +
                "Поколение: " + jaegerTwo.getMark() + "\n" +
                "Страна: " + jaegerTwo.getOrigin() + "\n" +
                "Рост: " + jaegerTwo.getHeight() + "м\n" +
                "Вес: " + jaegerTwo.getWeight() + "т\n" +
                "Сила: " + jaegerTwo.getStrength() + "\n" +
                "Броня: " + jaegerTwo.getArmor() + "\n");

        System.out.println("Дрифт - " + jaegerTwo.isDrift());
        jaegerTwo.move();
        System.out.println("Сканирование - " + jaegerTwo.scanKaiju());
        jaegerTwo.useAbility();
    }
}