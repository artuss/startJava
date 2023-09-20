public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Мальчик");
        wolfOne.setNickname("Призрак");
        wolfOne.setWeight(20.32d);
        wolfOne.setAge(9);
        wolfOne.setColor("Белый");

        System.out.println("Пол - " + wolfOne.getGender() + "\n" +
                "Кличка - " + wolfOne.getNickname() + "\n" +
                "Вес - " + wolfOne.getWeight() + " кг\n" +
                "Возраст - " + wolfOne.getAge() + "\n" +
                "Окрас - " + wolfOne.getColor() + "\n");

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}