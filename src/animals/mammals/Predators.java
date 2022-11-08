package animals.mammals;

import animals.Mammals;

import java.util.Objects;

public class Predators extends Mammals { // Хищники
    String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, String typeOfFood) {
        super(name, age, livingEnvironment);
        this.typeOfFood = Default(typeOfFood, "Не указан");
    }

    public void hunt() { // Охотиться
        System.out.println("Охотится на зайца");
    }

    public void eat() {
        System.out.println("Ест добычу");
    }

    public void go() {
        System.out.println("Ходит в поисках новой еды");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = Default(typeOfFood, "Не указан");
    }

    @Override
    public String toString() {
        return "Млекопитающие(хищники) : " + getName() + ", возвраст - " + getAge() + ", место обитания - " + livingEnvironment + ", тип пищи - " + typeOfFood;
    }

    public String Default(String value, String Default) {
        if (value == null || value.isBlank()) {
            return Default;
        } else {
            return value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
