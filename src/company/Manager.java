package company;

public class Manager extends Employee {

    private int bonus;
    private Secratary secratary;

    public Manager(String name, int salary) {
        super(name, salary,0);
        System.out.println("Wywołuje konstruktor1 klasy Managerz z argumentami: "+ name + " i "+ salary);
    }

    public Manager(String name, int salary, int bonus, int age) {
        super(name, salary, age);
        this.bonus = bonus;
        System.out.println("Wywołuje konstruktor2 klasy Managerz z argumentami: "+ name + " i "+ salary + " i " + bonus);
    }

    public void setSecratary(Secratary secratary) {
        this.secratary = secratary;
    }

    public void makeCall(String number){
        if (secratary == null){
            System.out.println("Nie umiem dzwonić");
        }else {
            secratary.makeCall(number);
        }
    }

    public void makeSpeech () {
        System.out.println("Jesteś zwyciężcą!");
    }

//    @Override //to jest opcjonalnie, jako informacja że jest przesłonięte
    public int getSalary() {  //przesłonięcie metody
//        return super.getSalary() + bonus;
        return salary + bonus;
    }

    public void makeSpeech (String additionalMessage) { //przeciążenie metody
        makeSpeech();
        System.out.println("Jesteś zwyciężcą!" + additionalMessage);
    }

}
