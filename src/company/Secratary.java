package company;

public final class Secratary extends Employee {

    public Secratary(String name, int salary, int age) {
        super(name, salary, age);
//        System.out.println("Wywołuje konstruktor klasy Secratary z argumentami: " + name + " i " + salary + " i mam lat " + age);
        System.out.printf("Wywołuje konstruktor klasy Secratary z argumentami: %s i %s i %s\n", name, salary, age);
    }

    public void makeCall(String number) {
        System.out.printf("Dzwonie do: " + number);
    }
}
