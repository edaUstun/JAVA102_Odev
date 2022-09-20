package Java102.Polymorphism;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.getName() + " havv.";
    }
}
