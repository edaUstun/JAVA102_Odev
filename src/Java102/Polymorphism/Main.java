package Java102.Polymorphism;

public class Main {

    public static void talking(Animal animal) {
        System.out.println(animal.talk());
    }

    public static void main(String[] args) {

        Animal animal1 = new Animal("Hiper");
        System.out.println(animal1.talk());

        Animal animal2 = new Cat("Hiper");
        System.out.println(animal2.talk());

        Animal animal3 = new Dog("Hiper");
        System.out.println(animal3.talk());

        Animal animal4 = new Horse("Hiper");
        //System.out.println(animal4.talk());

        talking(new Cat("Nasip"));
        talking(new Dog("Karabas"));
        talking(new Horse("Bold-Pilot"));
    }
}
