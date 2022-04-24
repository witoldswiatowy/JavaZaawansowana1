package fruits;

public class Box<T extends Apple> {


    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public static <A> A get (A a) {
        return a;
    }

    public int getWeight() {
        return content.weight +2;
    }

}
