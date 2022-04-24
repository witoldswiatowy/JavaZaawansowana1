import utils.StringHelper;

public class ExeptionExerciseMain {
    public static void main(String[] args) {
        int value = StringHelper.parseToInt("10");
        System.out.println(value);

        int wrongValue = StringHelper.parseToInt("abc");
        System.out.println(wrongValue);

        String finalSalary = StringHelper.calclulateSalary(11,0);
        System.out.println(finalSalary);

        StringHelper.calclulateSalary(11,-50);
    }
}
