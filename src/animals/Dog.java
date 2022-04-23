package animals;

public class Dog extends Animal implements Runner{

    public Dog(String name) {
        super(name);
    }

    @Override
    void saySomthing() {
        System.out.println(name + " hau hau");
    }

    @Override
    public void run() {
        System.out.println("Hop hop");
    }
}
