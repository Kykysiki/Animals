package animals;

import java.util.Objects;

public class Mammals extends Animals { // Млекопитающие
    public String livingEnvironment; // Среда проживания

    public Mammals(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = Validation.validDefault(livingEnvironment, "Не указано");
    }

    public void walk() { // Гулять

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Validation.validDefault(livingEnvironment, "Не указано");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }
}
