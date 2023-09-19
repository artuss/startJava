public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Мальчик";
        wolfOne.nickname = "Призрак";
        wolfOne.weight = 20.32d;
        wolfOne.age = 3;
        wolfOne.color = "Белый";

        System.out.println("Пол - " + wolfOne.gender + "\n" +
                "Кличка - " + wolfOne.nickname + "\n" +
                "Вес - " + wolfOne.weight + " кг\n" +
                "Возраст - " + wolfOne.age + "\n" +
                "Окрас - " + wolfOne.color + "\n");

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}