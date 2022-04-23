package company;

public class Employee {
    private String name;
    int salary;
    public final int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        System.out.println("Wywołuje konstruktor klasy Employee z argumentami: "+ name + " i "+ salary + " i mam lat "+ age);
    }

    public int getSalary() {
        return salary;
    }

    public void show () {
        System.out.println("Pracownik " + name + " zarabia " + salary + " i mam lat "+ age);
    }
}
