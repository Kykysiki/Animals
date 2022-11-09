import animals.Amphibians;
import animals.Animals;
import animals.birds.Flightless;
import animals.birds.Flying;
import animals.mammals.Herbivores;
import animals.mammals.Predators;

public class Main {
    public static void main(String[] args) {
        Animals frog = new Amphibians("Безухая квакша", 1, "Бразилия", 2);
        System.out.println(frog);
        frog.walk();
        frog.eat();
        frog.go();
        Animals moo = new Herbivores("Корова", 2, "Россия", "трава");
        System.out.println(moo);
        moo.graze();
        moo.eat();
        moo.go();
        Animals wolf = new Predators("Волк", 3, "Канада", "мясо");
        System.out.println(wolf);
        wolf.hunt();
        wolf.eat();
        wolf.go();
        Animals kakapo = new Flightless("Какапо", 2, "Новая Зеландия", "передвигаются по земле, по деревьям");
        System.out.println(kakapo);
        kakapo.walk();
        kakapo.eat();
        kakapo.go();
        Animals duck = new Flying("Утка", 2, "Россия", "по суше, по воздуху, по воде");
        System.out.println(duck);
        duck.fly();
        duck.eat();
        duck.go();
    }
}