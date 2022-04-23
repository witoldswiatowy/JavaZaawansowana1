package animals;

public class Duck extends Bird{
    public Duck(String name) {
        super(name);
    }

    @Override
    void saySomthing() {
        System.out.println(name + " kwa kwa");
    }
}
