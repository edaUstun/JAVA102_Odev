package Java102.Polymorphism;

public class Animal {

    private String name;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String talk() {
        return "Animal is talking";
    }
}
