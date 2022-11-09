package animals;

import java.util.Objects;

public class Amphibians extends Animals { //Земноводные
    public String livingEnvironment; // Среда проживания
    public int travelSpeed; // Скорость перемещения

    public Amphibians(String name, int age, String livingEnvironment, int travelSpeed) {
        super(name, age);
        this.travelSpeed = Validation.defaultNum(travelSpeed);
        this.livingEnvironment = Validation.validDefault(livingEnvironment, "Не указано");
    }

    public void walk() { // Гулять
        System.out.println("Гуляет у воды");
    }

    public void eat() {
        System.out.println("Ест насекомых");
    }

    public void go() {
        System.out.println("Прыгает от счастья");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Validation.validDefault(livingEnvironment, "Не указано");
    }

    public int getTravelSpeed() {
        return travelSpeed = Validation.defaultNum(travelSpeed);
    }

    @Override
    public String toString() {
        return "Земноводное: " + getName() + ", возвраст - " + getAge() + ", место обитания - " + livingEnvironment + ", скорость передвижения - " + travelSpeed + " м/с";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return travelSpeed == that.travelSpeed && Objects.equals(livingEnvironment, that.livingEnvironment);
    }
}
