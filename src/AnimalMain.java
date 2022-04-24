import animals.*;

public class AnimalMain {
    public static void main(String[] args) {
        FastRunner runnerDog = new Dog("Ares");
        Runner runnerCat = new Cat("Mruczek");
//        Runner runnerDuck = new Duck("Szara");  tego się nie da bo klasa Duck nie ma zaimplementowanego interfejsu


//        runnerDog.count();
        runnerCat.count();
        runnerDog.runFaster();

        if (runnerDog instanceof Cat){
            System.out.println("To jest kot");
        }
        if (runnerDog instanceof Dog){
            System.out.println("To jest pies");
            Dog dog = (Dog) runnerDog;
            dog.saySomething();
        }

        //klasa anonimowa
         Animal animal = new Animal("ślimak Romek") {
            @Override
             public void saySomething() {
                System.out.println("...");
            }
         };

        Runner runner = new Runner() {
            @Override
            public void run() {
                System.out.println("A ja chodze...");
            }
        };

        runner.run();

    }
}
