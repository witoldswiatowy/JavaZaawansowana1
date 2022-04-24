package electronics;

public class Tablet extends Device implements EmailSender {
    public Tablet(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet " + model + "włącza się");
    }

    @Override
    public void turnOff() {
        System.out.println("Tablet " + model + "włącza się");
    }

    //    void sendMessage(String type, String massage) {
//        if ("email".equals(type)) {
//            sendEmail(massage);
//        } else {
////        System.out.println("Wysyłam wiadomość " + type + " o treści: " + massage);
//            System.out.printf("Wysyłam wiadomość typu %s o treści: %s", type, massage);
//        }
//    }
//
//    @Override
//    public void sendEmail(String massage) {
//        System.out.println("Wysyłam maila z tabletu " + model + "o treści: " + massage);
//    }
    void sendMessage(String type, String massage) {
        System.out.printf("Wysyłam wiadomość typu %s z %s o treści: %s", type, model, massage);
    }

    @Override
    public void sendEmail(String massage) {
        sendMessage("email", massage);
    }
}
