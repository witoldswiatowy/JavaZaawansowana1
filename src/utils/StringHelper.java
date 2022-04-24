package utils;

public class StringHelper {

    public static int parseToInt (String value){
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Zamiana wartości nie powiodła się. " + e.getMessage());
            return 0;
        } finally {
            System.out.println("Zamiana zakończona dla tej wartości " + value);
        }
    }

    public static String calclulateSalary (int salary,int bonus) {
        int sum = salary + bonus;
        if (sum < 0) {
            throw new SalaryNegativNumberException(sum);
        }
        return String.valueOf(sum);
    }
}
