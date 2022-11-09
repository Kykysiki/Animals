package animals;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = Validation.validDefault(name, "Не указано");
        this.age = Validation.defaultNum(age);
    }

    public void eat() {

    }

    public void graze() {

    }

    public void sleep() {

    }

    public void walk() {

    }

    public void hunt() {

    }

    public void fly() {

    }

    public void go() {

    }

    public String getName() {
        return name = name;
    }

    public int getAge() {
        return age = age;
    }
}
