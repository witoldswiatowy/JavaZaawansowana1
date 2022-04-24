package electronics;

public class Phone extends Device implements EmailSender{

    private String number;

    public Phone(String model, String number) {
        super(model);
        this.number = number;
    }


    @Override
    public void turnOn() {
        System.out.println("Telefon " + model + "włącza się");
    }

    @Override
    public void turnOff() {
        System.out.println("Telefon " + model + "wyłącza się");
    }

    void makeCall (String number){
        System.out.println("Dzwonie pod numer " + number);
    }

    @Override
    public void sendEmail(String massage) {
        System.out.println("Wysyłam maila z telefonu " + model + "o treści: " + massage);
    }
}
