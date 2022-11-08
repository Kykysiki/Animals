package animals;

import java.util.Objects;

public class Birds extends Animals { // Птицы
    public String livingEnvironment; // Среда проживания

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = Default(livingEnvironment, "Не указана");
    }

    public void hunt() { // Охотится

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Default(livingEnvironment, "Не указана");
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
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
