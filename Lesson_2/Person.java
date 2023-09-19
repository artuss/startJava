public class Person {
    
    String gender = "Мужской";
    String name = "Артур";
    double height = 1.75;
    double weight = 81.2;
    int age = 33;

    void move() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void speak() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " учит Java");
    }
}