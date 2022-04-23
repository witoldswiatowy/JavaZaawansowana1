import animals.Cat;
import animals.Dog;
import animals.Duck;
import animals.Runner;

import java.util.function.Function;

public class AnimalMain {
    public static void main(String[] args) {
        Runner runnerDog = new Dog("Ares");
        Runner runnerCat = new Cat("Mruczek");
//        Runner runnerDuck = new Duck("Szara");  tego się nie da bo klasa Duck nie ma zaimplementowanego interfejsu


        runnerDog.count();
        runnerCat.count();
    }
}
