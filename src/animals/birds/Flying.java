package animals.birds;

import animals.Birds;

import java.util.Objects;

public class Flying extends Birds {
    String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = Default(movementType, "Не указан");
    }

    public void fly() {
        System.out.println("Летает над озером");
    }

    public void eat() {
        System.out.println("Есть семечка растений");
    }

    public void go() {
        System.out.println("Летает в поисках новых мест");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = Default(movementType, "Не указан");
    }

    @Override
    public String toString() {
        return "Птицы(летающие) : " + getName() + ", возвраст - " + getAge() + ", место обитания - " + livingEnvironment + ", тип передвижения - " + movementType;
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
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }
}
