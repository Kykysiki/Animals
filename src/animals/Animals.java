package animals;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = Default(name, "Не указано");
        this.age = DefaultNum(age);
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

    public String Default(String value, String Default) {
        if (value == null || value.isBlank()) {
            return Default;
        } else {
            return value;
        }
    }

    public int DefaultNum(int value) {
        if (value >= 0) {
            return value;
        } else {
            return Math.abs(value);
        }
    }
}
