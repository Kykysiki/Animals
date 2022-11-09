package animals;

import java.util.Objects;

public class Birds extends Animals { // Птицы
    public String livingEnvironment; // Среда проживания

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = Validation.validDefault(livingEnvironment, "Не указана");
    }

    public void hunt() { // Охотиться

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Validation.validDefault(livingEnvironment, "Не указана");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }
}
