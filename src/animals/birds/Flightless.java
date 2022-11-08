package animals.birds;

import animals.Birds;

import java.util.Objects;

public class Flightless extends Birds {
    String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = Default(movementType, "Не указан");
    }

    public void walk() {
        System.out.println("Гуляет по ветке дерева");
    }

    public void eat() {
        System.out.println("Ест фрукты");
    }

    public void go() {
        System.out.println("Дальше гуляет");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = Default(movementType, "Не указан");
    }

    @Override
    public String toString() {
        return "Птицы(нелетающие) : " + getName() + ", возвраст - " + getAge() + ", место обитания - " + livingEnvironment + ", тип передвижения - " + movementType;
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
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }
}
