import enumerated.Color;
import enumerated.MathOperation;
import enumerated.Size;

public class EnumeratedMain {
    public static void main(String[] args) {
     Integer x = 20;
        Color y = Color.BLUE;
        Color z = Color.RED;

        System.out.println(y.name()); //interpretacja na Stringa
        System.out.println(z.ordinal()); //indeks z Enuma

        Color[] values = Color.values();
        System.out.println(1);

        System.out.println("----");

        Size sizeMedium = Size.MEDIUM;
        int mediumMaxWeight = sizeMedium.getMaxWeight();
        System.out.println(mediumMaxWeight);

        Size otherSize1 = Size.MEDIUM;
        Size otherSize2 = Size.MEDIUM;
        Size otherSize3 = Size.MEDIUM;
        Size otherSize4 = Size.MEDIUM;
        Size otherSize5 = Size.MEDIUM; //tworzy się jeden obiekt cały czas

       System.out.println("------");

       float result1 = MathOperation.ADD.calculate(10.0f,5.0f);
       float result2 = MathOperation.SUBSTRACT.calculate(10.0f,5.0f);

       System.out.println(result1);
       System.out.println(result2);
    }
}
