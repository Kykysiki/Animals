package animals.mammals;

import animals.Mammals;
import animals.Validation;

import java.util.Objects;

public class Herbivores extends Mammals { // Травоядные
    String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, String typeOfFood) {
        super(name, age, livingEnvironment);
        this.typeOfFood = Validation.validDefault(typeOfFood, "Не указан");
    }

    public void graze() { // Пастись
        System.out.println("Пасется на лугу");
    }

    public void eat() {
        System.out.println("Кушает травку");
    }

    public void go() {
        System.out.println("Никуда не хочет идти");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = Validation.validDefault(typeOfFood, "Не указан");
    }

    @Override
    public String toString() {
        return "Млекопитающие(травоядные) : " + getName() + ", возвраст - " + getAge() + ", место обитания - " + livingEnvironment + ", тип пищи - " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }
}
