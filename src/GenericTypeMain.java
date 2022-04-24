import fruits.Apple;
import fruits.Box;

public class GenericTypeMain {
    public static void main(String[] args) {

        Apple apple = new Apple(10);

        Box<Apple> appleBox = new Box<Apple>(apple);

        Apple appleContent = appleBox.getContent();

    }
}
